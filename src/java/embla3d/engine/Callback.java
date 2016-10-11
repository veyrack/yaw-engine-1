package embla3d.engine;

import java.util.ArrayList;
import java.util.HashMap;
import static org.lwjgl.glfw.GLFW.*;
import embla3d.engine.Input;
import clojure.lang.IFn;

public class Callback {
    HashMap<Integer,ArrayList<Object>> map;
    
    public Callback(){
	map=new HashMap<Integer,ArrayList<Object>>();
    }

    public void registerCallback(String s,Object o){
		if(map.get(StringToKeyCode(s))==null)
		    map.put(StringToKeyCode(s),new ArrayList<Object>());
		map.get(StringToKeyCode(s)).add(o);
    }
    public void clearCallback(String s){
	if(map.containsKey(StringToKeyCode(s)))
	    map.remove(StringToKeyCode(s));
    }
    public void clearFunctionOfKey(String s,Object o){
	if(map.containsKey(StringToKeyCode(s)))
	    if(map.get(StringToKeyCode(s)).contains(o))
		map.get(StringToKeyCode(s)).remove(o);
    }
    public void update(){
	for(Integer i : map.keySet()){
	    if(Input.isKeyDown(i)){
		for(Object o: map.get(i)){
		    ((IFn) o).invoke();
		}
	    }
	}
    }
    public Integer StringToKeyCode(String s){
	switch(s){
	case("a"): return GLFW_KEY_Q;
	case("b"): return GLFW_KEY_B;
	case("c"): return GLFW_KEY_C;
	case("d"): return GLFW_KEY_D;
	case("e"): return GLFW_KEY_E;
	case("f"): return GLFW_KEY_F;
	case("g"): return GLFW_KEY_G;
	case("h"): return GLFW_KEY_H;
	case("i"): return GLFW_KEY_I;
	case("j"): return GLFW_KEY_J;
	case("k"): return GLFW_KEY_K;
	case("l"): return GLFW_KEY_L;
	case("m"): return GLFW_KEY_M;
	case("n"): return GLFW_KEY_N;
	case("o"): return GLFW_KEY_O;
	case("p"): return GLFW_KEY_P;
	case("q"): return GLFW_KEY_A;
	case("r"): return GLFW_KEY_R;
	case("s"): return GLFW_KEY_S;
	case("t"): return GLFW_KEY_T;
	case("u"): return GLFW_KEY_U;
	case("v"): return GLFW_KEY_V;
	case("w"): return GLFW_KEY_Z;
	case("x"): return GLFW_KEY_X;
	case("y"): return GLFW_KEY_Y;
	case("z"): return GLFW_KEY_W;
	case("0"): return GLFW_KEY_KP_0;
	case("1"): return GLFW_KEY_KP_1;
	case("2"): return GLFW_KEY_KP_2;
	case("3"): return GLFW_KEY_KP_3;
	case("4"): return GLFW_KEY_KP_4;
	case("5"): return GLFW_KEY_KP_5;
	case("6"): return GLFW_KEY_KP_6;
	case("7"): return GLFW_KEY_KP_7;
	case("8"): return GLFW_KEY_KP_8;
	case("9"): return GLFW_KEY_KP_9;
	default: return GLFW_KEY_KP_ADD;

	}
    }

}

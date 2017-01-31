package embla3d.engine.meshs;

/**
 * Mesh representing a Octahedron : default weight 6
 * Useless for the moment will be removed during the upcoming refactoring
 */
public class OctahedronMesh extends Mesh {
    public OctahedronMesh(float[] vertices, Material material, float[] normals, int[] indices) {
        super(vertices, material, normals, indices, 6);
    }

    public OctahedronMesh(float[] vertices, float cx, float cy, float cz, float reflectance, float[] normals, int[] indices) {
        super(vertices, cx, cy, cz, reflectance, normals, indices, 6);
    }
}

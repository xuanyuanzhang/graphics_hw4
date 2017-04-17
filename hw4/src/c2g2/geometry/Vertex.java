package c2g2.geometry;

import org.joml.Vector3f;

/*
 * TODO:
 * 
 * Vertex referred by the HalfEdge data structure
 * 
 * Please add code if needed
 */
public class Vertex {
	
	private HalfEdge e = null;
	
	private Vector3f pos = null;
	
	private Vector3f norm = null;
	
	public Vertex(Vector3f pos, Vector3f norm){
		this.pos = pos;
		this.norm = norm;
	}
	
	public Vector3f getPos() {
		return pos;
	}
	public void setPos(Vector3f pos) {
		this.pos = pos;
	}
	public Vector3f getNorm() {
		return norm;
	}
	public void setNorm(Vector3f norm) {
		this.norm = norm;
	}
	
	public HalfEdge getEdge(){
		return e;
	}
	
	public void setEdge(HalfEdge e0){
		e=e0;
	}
	public boolean hasEdge(){
		return e!=null;
	}
	
}

package com.openorpg.simpleorpg.server;

public class Player {
	private String name;
	private String ref;
	private String mapRef;
	private Long lastMovedTime=0l;
	private int x=0, y=0;
	private static int numPlayers = 0;
	private int id;
	
	public Player(String name, String ref, String mapRef) {
		setName(name);
		setRef(ref);
		setMapRef(mapRef);
		setId(numPlayers);
		synchronized(this) {
			numPlayers += 1;
		}
	}
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref.toLowerCase();
	}
	
	@Override
	public String toString() {
		return (id + "," + mapRef + "," + name + "," + ref + "," + x + "," + y);
	}

	public String getMapRef() {
		return mapRef;
	}

	public void setMapRef(String mapRef) {
		this.mapRef = mapRef.toLowerCase();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getLastMovedTime() {
		return lastMovedTime;
	}

	public void setLastMovedTime(Long lastMovedTime) {
		this.lastMovedTime = lastMovedTime;
	}
	

}

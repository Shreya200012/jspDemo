package com.oop3;

public class poly1 {
public static void main(String[] args) {
	for(int i = 1;i<2;i++) {
		movie mymovie = randomMovie();
		System.out.println("Movie number "+i+" Name "+mymovie.getName()+" Plot: "+mymovie.plot());
	}
}

private static movie randomMovie() {
	// TODO Auto-generated method stub
	int random = (int)(Math.random()*5);
	switch(random) {
	case 1:
		return  new Pushpa();
	case 2 :
		return new MSDhoni();
		
	}

	
	return null;
}
}

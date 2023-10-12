package Inheritance;

/**
 * 
 */
public class MoviesList extends HerosList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoviesList ml=new MoviesList();
		ml.movieNames();
		ml.heroNames();
	}
    public void movieNames() {
    	System.out.println("Gabber singh");
    	System.out.println("Bahubali");
    	System.out.println("pushpa");
    }
}

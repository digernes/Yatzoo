/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Jostein
 *
 */
public class Terning {
	String dyr;

	public Terning() {
		trill();
	}

	public String getDyr() {
		return dyr;
	}

	public void setDyr(String dyr) {
		this.dyr = dyr;
	}
	
	public void trill() {
		Integer tilf = (int) (Math.random() * 6);
		switch (tilf) {
		case 0:
			dyr = "L�ve";
			break;
		case 1:
			dyr = "Slange";
			break;
		case 2:
			dyr = "Panda";
			break;
		case 3:
			dyr = "Gris";
			break;
		case 4:
			dyr = "Elefant";
			break;
		case 5:
			dyr = "Hval";
			break;
		}
	}

}
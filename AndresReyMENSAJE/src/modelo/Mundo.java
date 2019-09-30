package modelo;

public class Mundo {
private Pirata Sparrow;
private Persistencia BD;
public Mundo() {
	Sparrow = new Pirata();
	BD = new Persistencia();
}
public Pirata getSparrow() {
	return Sparrow;
}
public void setSparrow(Pirata sparrow) {
	Sparrow = sparrow;
}
public Persistencia getBD() {
	return BD;
}
public void setBD(Persistencia bD) {
	BD = bD;
}

}

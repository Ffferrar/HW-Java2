public class Vector
{
    double x, y, z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double myX(){
        return x;

    }
    public double myY(){
        return y;
    }
    public double myZ(){
        return z;
    }
    // Длина вектора. Корень из суммы квадратов
    double length(){
       return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return (this.x*x + this.y*y + this.z*z);
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector ( vector.z*y - vector.y*z, vector.x*z - vector.z*x, vector.y*x - vector.x*y);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return ( (scalarProduct(vector)) / (length() * vector.length()) );
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector (this.x + vector.x, this.y + vector.y,this.z + vector.z);
    }

    // Разность двух векторов
    Vector subtract(Vector vector){
        return new Vector(this.x - vector.x, this.y - vector.y,this.z - vector.z);
    }
    @Override
    public int hashCode() {
        final int done = 31;
        int result;
        result = done + (int) x;
        result = done + (int) y;
        result = done + (int) z;
        return result;}

    public boolean equals(Object obj){
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Vector vector = (Vector) obj;
        return this.length() == vector.length() && this.cos(vector) == 1.0;
    }
}

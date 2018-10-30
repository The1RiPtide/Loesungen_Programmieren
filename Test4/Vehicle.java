public class Vehicle
{
    int wheels;
    int weight;
    String name;
    String[] additionalProperty;

    Vehicle(){}

    Vehicle(int wheels, int weight, String name, String[]additionalProperty)
    {
        this.wheels = wheels;
        this.weight = weight;
        this.name = name;
        this.additionalProperty = additionalProperty;
    }

    boolean equalsVehicle(Vehicle a)
    {
        boolean additionalPropertyOk = true;
        if (this.additionalProperty.length != a.additionalProperty.length)
        {
            return false;
        }

        for (int i = 0;i<this.additionalProperty.length;i++)
        {
            if (!this.additionalProperty[i].equals(a.additionalProperty[i]))
            {
                additionalPropertyOk = false;
            }
        }
        return (this.wheels == a.wheels &&
                this.weight == a.weight &&
                this.name.equals(a.name) &&
                additionalPropertyOk);
    }


}

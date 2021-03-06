//This code was created by Albard Espinoza.
public class Test {

    public static void main(String[] args) {
        int[] radius = {4, 5, 2, 11, 100, 50, 31, 31, 19, 2, 11, 300, 221, 2, 50};
        int[] height = {1, 2, 5, 14, 91, 51, 82, 11, 19, 2, 11, 33, 221, 5, 5};

        /* Step 1
            Insert a lambda expression where
            Cylinder1 > Cylinder2 if radius of Cylinder1 > radius Cylinder2
            Cylinder1 = Cylinder2 if radius of Cylinder1 = radius Cylinder2
            Cylinder1 < Cylinder2 if radius of Cylinder1 < radius Cylinder2
        */
        SortedLinkedList<Cylinder> list
                = new SortedLinkedList<>((x, y) -> x.getRadius() - y.getRadius());
        for (int i = 0; i < radius.length; i++) {
            list.add(new Cylinder(radius[i], height[i]));
        }

        System.out.println("\nAscending order by radius");
        for (Cylinder x : list) {
            System.out.println(x);
        }


        SortedLinkedList<Cylinder> lessThan = list.lessThan(new Cylinder(100, 4));
        System.out.println("\nRadius < 100");
        for (Cylinder x : lessThan) {
            System.out.println(x);
        }


        SortedLinkedList<Cylinder> greaterThan = list.greaterThan(new Cylinder(25, 4));
        System.out.println("\nRadius > 25");
        for (Cylinder x : greaterThan) {
            System.out.println(x);
        }

        /* Step 2
            Insert a lambda expression where
            Cylinder1 > Cylinder2 if height of Cylinder1 < height Cylinder2
            Cylinder1 = Cylinder2 if height of Cylinder1 = height Cylinder2
            Cylinder1 < Cylinder2 if height of Cylinder1 > height Cylinder2
        */

        list = new SortedLinkedList<>((x, y) -> -(x.getHeight() - y.getHeight()));
        for (int i = 0; i < radius.length; i++) {
            list.add(new Cylinder(radius[i], height[i]));
        }

        System.out.println("\nDescending order by height");
        for (Cylinder x : list) {
            System.out.println(x);
        }
        lessThan = list.lessThan(new Cylinder(5, 20));
        System.out.println("\nHeights greater than 20");
        for (Cylinder x : lessThan) {
            System.out.println(x);
        }
        greaterThan = list.greaterThan(new Cylinder(5, 20));
        System.out.println("\nHeights less than 20");
        for (Cylinder x : greaterThan) {
            System.out.println(x);
        }
    }
}

/*The whole point of this is that we've been using compare so that we can compare different types of
* objects in the way we want by implementing the lambda expression.*/
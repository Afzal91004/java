class RoundPeg {
    int radius;

    RoundPeg(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return this.radius;
    }
}

class RoundHole {
    int radius;

    RoundHole(int r) {
        this.radius = r;
    }

    public boolean canFit(RoundPeg hole) {
        return this.radius >=hole.getRadius();
    }
}

class SquarePeg {
    int side;

    SquarePeg(int s) {
        this.side = s;
    }
}

class SquarePegAdapter extends RoundPeg {
    SquarePeg squarePeg;

    SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.side);

        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius(){
        return (int)(squarePeg.side * Math.sqrt(2)) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(8);
        SquarePeg squarePeg = new SquarePeg(10);

        System.out.println("Square Peg can fit into hole? "+hole.canFit(new SquarePegAdapter(squarePeg)));
        System.out.println("Round Peg can fit into hole? "+hole.canFit(roundPeg));
    }
}
interface Prototype {
    Prototype clone();
    String getType();
}

class PrototypeModule {
    private static List<Prototype> prototypes = new ArrayList<>();

    public static void addPrototype(Prototype p) {
        prototypes.add(p);
    }

    public static Prototype buildPrototype(String name) {
        for(Prototype p : prototypes) {
            if(p.getType().equals(name)) {
                return p.clone();
            }
        }
        return null;
    }
}

class PrototypeA  implements Prototype {
    private String _type = "A";

    @Override
    public Prototype clone() {
        return new PrototypeA();
    }

    @Override
    public getType() {
        return _type;
    }
}

class PrototypeB  implements Prototype {
    private String _type = "B";

    @Override
    public Prototype clone() {
        return new PrototypeA();
    }

    @Override
    public getType() {
        return _type;
    }
}
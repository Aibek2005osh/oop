package country;

public class Country {
    private String name;
    private long  kalky;
    private long aianty;
    private String tili;

    public Country() {
    }

    public Country(String name, long kalky, long aianty, String tili) {
        this.name = name;
        this.kalky = kalky;
        this.aianty = aianty;
        this.tili = tili;
    }



    public static Country metod(Country [] countries) {
        Country maxAraekalky = countries[0];

        for (Country country : countries) {
            if (maxAraekalky.kalky > country.kalky) {
                maxAraekalky = country;
            }

        }
        return maxAraekalky;
    }

        @Override
        public String toString() {
            return " {" +
                    "name ='" + name + '\'' +
                    ", kalky = " + kalky +
                    ", aianty =   " + aianty +
                    ", tili = '" + tili + '\'' +
                    '}';
        }

    }



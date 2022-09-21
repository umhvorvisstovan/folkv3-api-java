package fo.us.folkv3.api.cert;

final class Env {

    public static String property(String name) {
        var value = System.getProperty(name);
        if (value == null) value = System.getenv(toEnv(name));
        return value;
    }

    public static String toEnv(String name) {
        return name.toUpperCase().replace('.', '_');
    }

}

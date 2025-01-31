public class Main {
    public static void main(String[] args) {

        Musician musician = new Musician();
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        Flute flute = new Flute();

        musician.playing(piano);
        musician.playing(guitar);
        musician.playing(flute);
    }
}
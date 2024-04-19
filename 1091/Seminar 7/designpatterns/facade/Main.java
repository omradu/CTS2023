public class Main {
    public static void main(String[] args) {
        Aspirator aspirator = new Aspirator();
        Blender blender = new Blender();
        Jaluzele jaluzeleSufragerie = new Jaluzele();
        Jaluzele jaluzeleDormitor = new Jaluzele();
        Lumini luminiBucatarie = new Lumini();
        Lumini luminiSufragerie = new Lumini();
        Lumini luminiBaie = new Lumini();
        Lumini luminiDormitor = new Lumini();
        Termostat termostat = new Termostat();
        TV tvSufragerie = new TV();

        Marius Marius = new Marius(aspirator,blender, jaluzeleSufragerie, jaluzeleDormitor, luminiBucatarie, luminiSufragerie, luminiBaie, luminiDormitor, termostat, tvSufragerie);

        Marius.bunaDimineata();

        Marius.teRogFaCurat();

        Marius.noapteBuna();
    }
}

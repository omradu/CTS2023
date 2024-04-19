public class Marius {
    Aspirator aspirator;
    Blender blender;
    Jaluzele jaluzeleSufragerie;
    Jaluzele jaluzeleDormitor;
    Lumini luminiBucatarie;
    Lumini luminiSufragerie;
    Lumini luminiBaie;
    Lumini luminiDormitor;
    Termostat termostat;
    TV tvSufragerie;

    public Marius(Aspirator aspirator, Blender blender, Jaluzele jaluzeleSufragerie, Jaluzele jaluzeleDormitor, Lumini luminiBucatarie, Lumini luminiSufragerie, Lumini luminiBaie, Lumini luminiDormitor, Termostat termostat, TV tvSufragerie) {
        this.aspirator = aspirator;
        this.blender = blender;
        this.jaluzeleSufragerie = jaluzeleSufragerie;
        this.jaluzeleDormitor = jaluzeleDormitor;
        this.luminiBucatarie = luminiBucatarie;
        this.luminiSufragerie = luminiSufragerie;
        this.luminiBaie = luminiBaie;
        this.luminiDormitor = luminiDormitor;
        this.termostat = termostat;
        this.tvSufragerie = tvSufragerie;
    }

    public void bunaDimineata() {
        jaluzeleDormitor.deschide();
        jaluzeleSufragerie.deschide();
        luminiBucatarie.aprinde();
        blender.porneste();
        termostat.pornesteCalsura();
        termostat.seteazaTemperatura(22);

        System.out.println("Spor la cafelutza!");
    }

    public void noapteBuna() {
        jaluzeleDormitor.inchide();
        jaluzeleSufragerie.inchide();
        luminiBucatarie.stinge();
        luminiBaie.stinge();
        luminiSufragerie.stinge();
        luminiDormitor.stinge();
        tvSufragerie.opreste();

        System.out.println("Dormeo, noapte bunaaa!");
    }

    public void teRogFaCurat() {
        aspirator.porneste();
        jaluzeleSufragerie.deschide();
        jaluzeleDormitor.deschide();
        tvSufragerie.porneste();

        System.out.println("Vin musafiri!");

    }
}

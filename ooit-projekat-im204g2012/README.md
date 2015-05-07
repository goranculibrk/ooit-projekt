# Vežba 1 #

1. Upoznavanje sa razvojnim okruženjem Eclipse
2. Kreirati klasu `Tačka`
	1. pokrenuti kreiranje nove klase
	2. definisati varijable `int x` i `int y`
	3. implementirati metode pristupa za definisane varijable instance

3. Pregled sadržaja foldera na disku gde su smešteni `.java` i `.class` fajlovi

# Vežba 2 #

1. Implementirati sledeće metode u klasi `Tacka`
	1. `void pomeriNa (int novoX, int novoY)`
	2. `void pomeriZa (int poX, int poY)`
	3. `double udaljenost (Tacka t)`

2. Kreirati klasu `Linija`
	1. definisati varijable instance koje odgovaraju početnoj i krajnjoj tački
	2. implementirati metode pristupa za definisane varijable instance
	3. implementirati metodu `double duzina()`
	4. implementirati metodu `void pomeriZa (int poX, int poY)`

# Vežba 3 #

1. Kreirati klasu `Pravougaonik` tako da varijable instance predstavljaju
	1. tačku gornjeg levog ugla pravougaonika `tGoreLevo`
	2. širinu pravougaonika `lSirina`
	3. visinu pravougaonika `lVisina`
2. Implementirati metode pristupa za sve varijable instance klase `Pravougaonik`
3. U klasi `Pravougaonik` implementirati metode koje vraćaju: 
	1. površinu pravougaonika `povrsina()`
	2. obim pravougaonika `obim()`

# Vežba 4 #

1. Kreirati klasu `Kvadrat` tako da varijable instance predstavljaju
	1. tačku gornjeg levog ugla kvadrata `tGoreLevo`
	2. dužinu stranice kvadrata `stranica`
2. Implementirati metode pristupa za sve varijable instance klase `Kvadrat`
3. U klasi `Kvadrat` implementirati metode koje vraćaju:
	1. površinu kvadrata `povrsina()`
	2. obim kvadrata `obim()`
	3. ~~dijagonalu kvadrata od gornje leve do donje desne tačke `dijagonala()`~~
	4. ~~centralnu tačku kvadrata `centar`~~


# Vežba 5 #
1. Kreirati klasu `Krug` tako da varijable instance predstavljaju
	1. centralnu tačku kruga `Tacka centar`
	2. dužinu poluprečnika kruga `int poluprecnik`
2. Implementirati metode pristupa za sve varijable instance klase `Krug`
3. U klasi `Krug` implementirati metode koje vraćaju: 
	1. površinu kruga `povrsina()`
	2. obim kruga `obim()`

**Napomena: Za računanje površine i obima kruga koristiti statičku konstantu `Math.PI`**

# Vežba 6 #

1. U svaku od postojećih klasa dodati varijablu instance `String boja`
2. Implemetnirati metode pristupa za varijablu instance `boja` 
3. U svakoj klasi implementirati po dva konstruktora. Jedan treba da omogući inicijalizaciju svih varijabli instance osim boje, a drugi sve varijable instance uključujući i boju.

# Vežba 7 #
1. U klasi `Linija` implemetirati metode koje vraćaju:
	1. središnju tačku linije `sredina()`
2. U klasi `Pravougaonik` implementirati metode koje vraćaju:
	1. dijagonalu pravougaonika od gornje leve do donje desne tačke `dijagonala()`
	2. centralnu tačku pravougaonika `centar()`
3. U klasi `Kvadrat` implementirati metode koje vraćaju:
	1. dijagonalu kvadrata od gornje leve do donje desne tačke `dijagonala()`
	2. centralnu tačku kvadrata `centar()`
4. U klasi `Tacka` preklopiti metodu `public String toString()` tako da stanje objekta reprezentuje na sledeći način: `(x,y)`
5. U klasi `Linija` preklopiti metodu `public String toString()` tako da stanje objekta reprezentuje na sledeći način: `(xPocetne, yPocetne) -> (xKrajnje, yKrajnje)`
6. U klasi `Kvadrat` preklopiti metodu `public String toString()` tako da stanje objekta reprezentuje na sledeći način: `gornji levi ugao = (xGLU, yGLU), stranica = duzinaStranice`
7. U klasi `Pravougaonik` preklopiti metodu `public String toString()` tako da stanje objekta reprezentuje na sledeći način: `gornji levi ugao = (xGLU, yGLU), širina = sirina, visina = visina`
8. U klasi `Krug` preklopiti metodu `public String toString()` tako da stanje objekta reprezentuje na sledeći način: `centar = (xCentra, yCentra), poluprečnik = poluprecnik`

# Vežba 8 #

1. Dodati novi klasu `Oblik`. Modifikovati klase `Tacka`, `Linija`, `Krug`, `Kvadrat` tako da budu izvedene iz klase `Oblik`. Modifikovati klasu `Pravougaonik` takoda bude izvedena iz klase `Kvadrat`.
2. U klasu `Oblik` prebaciti varijablu `private String boja` i njene metode pristupa iz svih izvedenih klasa.
3. U klasi `Oblik` implementirati dva konstruktora:
	1. koji nema parametara i ne radi ništa
	2. koji prihvata parametar za inicijalizaciju boje
4. U klasama koje su direktno izvedene iz klase `Oblik` korigovati konstruktore koji imaju parametar za inicijalizaciju boje tako da u prvom redu konstruktor nadređene klase kako bi se inicijalizovala varijabla `boja#`.
5. U klasi `Pravougaonik` preimenovati varijablu `private int sirina`. Gde je potrebno promeniti specifikator pristupa varijablama u klasi `Kvadrat` sa `private` na `protected`.

# Vežba 9 #

1. U klasi `Tacka` preklopiti metodu `public boolean equals(Object obj)` tako da vraća `true` ukoliko tačke imaju istu boju i koordinate.
2. U klasi `Linija` preklopiti metodu `public boolean equals(Object obj)` tako da vraća `true` ukoliko tačke imaju istu boju i istu početnu i krajnju tačku.
3. U klasi `Krug` preklopiti metodu `public boolean equals(Object obj)` tako da vraća `true` ukoliko tačke imaju isti centar i poluprečnik.
4. U klasi `Kvadrat` preklopiti metodu `public boolean equals(Object obj)` tako da vraća `true` ukoliko tačke imaju istu gornju levu tačku i stranicu.
5. U klasi `Pravougaonik` preklopiti metodu `public boolean equals(Object obj)` tako da vraća `true` ukoliko tačke imaju istu gornju levu tačku, širinu i visinu.

# Vežba 10 #

1. Klasu `Oblik` modifikovati tako da bude apstraktna klasa. Dodati apstraktnu metodu `public void crtajSe(Graphics g)`.
2. U klasi `Oblik` dodati metodu `public static Color pronadjiBoju(String boja)` koja za prosleđeni string vrati boju kojom se crta oblik. Na primer, kada se metodi prosledi parametar `crna` ona treba da vrati `Color.BLACK`. Implementirati metodu tako da radi za boje: crna, bela, crvena, plava, zuta i zelena.
3. Preklopiti metodu `public void crtajSe(Graphics g)` u svim klasama izvedenim iz klase `Oblik`, saglasno načinu iscrtavanja svake od klasa. Prilikom crtanja koristiti boju koja odgovara vrednosti varijable instance `boja`. Default vrednost varijable instance `boja` treba da bude `crna`.
4. Testirati iscrtavanja oblika pomoću klase `Crtez`.

# Vežba 11 #

1. Kreirati apstraktnu klasu `PovrsinskiOblik` koja je izvedena iz klase oblik i ima svoju varijablu `private String bojaUnutrasnjosti` koja je po defaultu postavljena na vrednost `bela`.
2. Implementirati metode pristupa za varijablu instance `bojaUnutrasnjosti`.
3. Dodati apstraktnu metodu `public abstract void popuni(Graphics g)` koja treba da oboji unutrašnjost površinskog oblika bojom koja odgovara vrednosti varijable instance `bojaUnutrasnjosti`.
4. Dodati apstraktnu metodu `public abstract boolean sadrzi(int x, int y)` koja treba da detektuje da li površinski oblik sadrži mesto čije su koordinate `x` i `y` zadate.
5. dodati apstraktne metode `public abstract double povrsina()` i `public abstract double obim()`.
6. Modifikovati klase `Krug` i `Kvadrat` tako da budu izvedene iz klase `PovrsinskiOblik`. Implementirati metode koje nedostaju ili korigovati postojeće saglasno nasleđenim metodama.
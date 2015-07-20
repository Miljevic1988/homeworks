Sortirane linkane liste

Iskoristit �emo na�e poznavanje algoritama za sortiranje, te novonau�ene vje�tine rukovanja linkanim listama, da napravimo novu strukturu: sortirana linkana lista.

Ova linkana lista se razlikuje od obi�ne linkane liste po tome �to su elementi u njoj uvijek poredani u rastu�em redoslijedu, bez obzira na to kojim su se redoslijedom dodavali u listu.

Za ovu svrhu vam je dostavljena klasa SortedIntList koja sadr�i ve� neke manje ili vi�e implementirane metode.

Zadaci:

    Implementirajte metodu add(int n) tako da doda broj n u linkanu listu uzimaju�i u obzir da linkana lista nakon pokretanja treba biti sortirana u rastu�em redoslijedu
        ako vam se ovaj zadatak poka�e kao suvi�e komplikovan, a �elite poku�ati uraditi ostale zadatke, implementirajte add(n) metodu tako da dodaje element na kraj liste. Sli�ne primjere smo ve� radili na GitHub-u.

    Dovr�ite implementaciju metode toArray() tako da vra�a niz koji sadr�i sve elemente iz liste u ispravnom redoslijedu.

    (bonus) Prepi�ite metodu getLength() tako da ra�una du�inu liste reukurzivno umjesto iterativno.
        HINT: Sama metoda getLength() ne treba da bude rekurzivna, ve� �e vam trebati pomo�na metoda koja prima argument tipa Node. Ne zaboravite da je linkana lista definisana rekurzivno: svaki �vor linkane liste pokazuje na prvi �vor ostatka linkane liste :)
        (malo manji bonus) Ako ne uspijete implementirati rekurzivno brojanje elemenata, jo� uvijek mo�ete spasiti obraz ako prepi�ete getLength() metodu tako da koristi for umjesto while petlje. Za ovo imate par hintova u k�du objavljenom nakon dana�njeg predavanja.

Ako ispravno uradite 1. i 2. zadatak, ovo bi trebao biti rezultat pokretanja programa:

Unesite proizvoljan broj pozitivnih brojeva:
3
2
4
1
5
0
Unijeli ste 5 pozitivnih brojeva
Poredani brojevi:
1
2
3
4
5

I jo� jedan primjer;

Unesite proizvoljan broj pozitivnih brojeva:
1
2
3
4
5
0
Unijeli ste 5 pozitivnih brojeva
Poredani brojevi:
1
2
3
4
5

I jo� jedan:

Unesite proizvoljan broj pozitivnih brojeva:
5
4
3
2
1
0
Unijeli ste 5 pozitivnih brojeva
Poredani brojevi:
1
2
3
4
5

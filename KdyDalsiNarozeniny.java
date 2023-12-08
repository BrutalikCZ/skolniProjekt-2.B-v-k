int desiredAgeDifference = this.desiredAge - age;
String desiredAgeYear = this.getDate(this.birthDay, desiredAgeDifference);

int desiredAgeDifferenceDays = new VypocetCislaDni(desiredAgeYear, "today").get();

System.out.println("Do požadovaného vìku " + this.desiredAge + ", kterého dosáhneš o narozeninách l.p. "+ desiredAgeYear + " chybí: " + desiredAgeDifferenceDays + " dnù tj.: pøibližnì ( " + desiredAgeDifference + " ) let.");

switch ((int) diff) {
    case 0:
        this.congrats("k narozeninám");
        break;
    default: 
        if (diff < 0) {
            if (diff < -60 || diff > 60) {
                if (diff < -60) {
                    diff = diff + 365;
                } else {
                    diff = diff - 365;
                }
                System.out.println("Ještì to potrvá. Aktuálnì Ti zbývá ještì: " + Math.abs(diff) + " dnù do dalších narozenin.");
                break;
            }

            if (diff >= -30) {
                this.congrats("k narozeninám x");
            }
            if (diff >= -60) {
                this.congrats("k narozeninám (pozdì, ale pøece).");
            }
        } else {
            if (diff <= 30) {
                this.congrats("k budoucím narozeninám");
            }
        }
        System.out.println("Zbývá ještì: " + Math.abs(diff) + " dnù do dalších narozenin.");
}
}

private void congrats(String message) {
System.out.println("Gratulace " + message);
}

public Boolean hasErrors() {
return this.hasErrors;
}
}



package org.nwnx.nwnx2.jvm.constants;

/**
 * This class contains all unique constants beginning with "TRAP".
 * Non-distinct keys are filtered; only the LAST appearing was
 * kept.
*/
public final class Trap {
  private Trap() {}

  public final static int BASE_TYPE_AVERAGE_ACID = 13;
  public final static int BASE_TYPE_AVERAGE_ACID_SPLASH = 41;
  public final static int BASE_TYPE_AVERAGE_ELECTRICAL = 21;
  public final static int BASE_TYPE_AVERAGE_FIRE = 17;
  public final static int BASE_TYPE_AVERAGE_FROST = 29;
  public final static int BASE_TYPE_AVERAGE_GAS = 25;
  public final static int BASE_TYPE_AVERAGE_HOLY = 5;
  public final static int BASE_TYPE_AVERAGE_NEGATIVE = 33;
  public final static int BASE_TYPE_AVERAGE_SONIC = 37;
  public final static int BASE_TYPE_AVERAGE_SPIKE = 1;
  public final static int BASE_TYPE_AVERAGE_TANGLE = 9;
  public final static int BASE_TYPE_DEADLY_ACID = 15;
  public final static int BASE_TYPE_DEADLY_ACID_SPLASH = 43;
  public final static int BASE_TYPE_DEADLY_ELECTRICAL = 23;
  public final static int BASE_TYPE_DEADLY_FIRE = 19;
  public final static int BASE_TYPE_DEADLY_FROST = 31;
  public final static int BASE_TYPE_DEADLY_GAS = 27;
  public final static int BASE_TYPE_DEADLY_HOLY = 7;
  public final static int BASE_TYPE_DEADLY_NEGATIVE = 35;
  public final static int BASE_TYPE_DEADLY_SONIC = 39;
  public final static int BASE_TYPE_DEADLY_SPIKE = 3;
  public final static int BASE_TYPE_DEADLY_TANGLE = 11;
  public final static int BASE_TYPE_EPIC_ELECTRICAL = 44;
  public final static int BASE_TYPE_EPIC_FIRE = 45;
  public final static int BASE_TYPE_EPIC_FROST = 46;
  public final static int BASE_TYPE_EPIC_SONIC = 47;
  public final static int BASE_TYPE_MINOR_ACID = 12;
  public final static int BASE_TYPE_MINOR_ACID_SPLASH = 40;
  public final static int BASE_TYPE_MINOR_ELECTRICAL = 20;
  public final static int BASE_TYPE_MINOR_FIRE = 16;
  public final static int BASE_TYPE_MINOR_FROST = 28;
  public final static int BASE_TYPE_MINOR_GAS = 24;
  public final static int BASE_TYPE_MINOR_HOLY = 4;
  public final static int BASE_TYPE_MINOR_NEGATIVE = 32;
  public final static int BASE_TYPE_MINOR_SONIC = 36;
  public final static int BASE_TYPE_MINOR_SPIKE = 0;
  public final static int BASE_TYPE_MINOR_TANGLE = 8;
  public final static int BASE_TYPE_STRONG_ACID = 14;
  public final static int BASE_TYPE_STRONG_ACID_SPLASH = 42;
  public final static int BASE_TYPE_STRONG_ELECTRICAL = 22;
  public final static int BASE_TYPE_STRONG_FIRE = 18;
  public final static int BASE_TYPE_STRONG_FROST = 30;
  public final static int BASE_TYPE_STRONG_GAS = 26;
  public final static int BASE_TYPE_STRONG_HOLY = 6;
  public final static int BASE_TYPE_STRONG_NEGATIVE = 34;
  public final static int BASE_TYPE_STRONG_SONIC = 38;
  public final static int BASE_TYPE_STRONG_SPIKE = 2;
  public final static int BASE_TYPE_STRONG_TANGLE = 10;

  public static String nameOf(int value) {
    if (value == 13) return "Trap.BASE_TYPE_AVERAGE_ACID";
    if (value == 41) return "Trap.BASE_TYPE_AVERAGE_ACID_SPLASH";
    if (value == 21) return "Trap.BASE_TYPE_AVERAGE_ELECTRICAL";
    if (value == 17) return "Trap.BASE_TYPE_AVERAGE_FIRE";
    if (value == 29) return "Trap.BASE_TYPE_AVERAGE_FROST";
    if (value == 25) return "Trap.BASE_TYPE_AVERAGE_GAS";
    if (value == 5) return "Trap.BASE_TYPE_AVERAGE_HOLY";
    if (value == 33) return "Trap.BASE_TYPE_AVERAGE_NEGATIVE";
    if (value == 37) return "Trap.BASE_TYPE_AVERAGE_SONIC";
    if (value == 1) return "Trap.BASE_TYPE_AVERAGE_SPIKE";
    if (value == 9) return "Trap.BASE_TYPE_AVERAGE_TANGLE";
    if (value == 15) return "Trap.BASE_TYPE_DEADLY_ACID";
    if (value == 43) return "Trap.BASE_TYPE_DEADLY_ACID_SPLASH";
    if (value == 23) return "Trap.BASE_TYPE_DEADLY_ELECTRICAL";
    if (value == 19) return "Trap.BASE_TYPE_DEADLY_FIRE";
    if (value == 31) return "Trap.BASE_TYPE_DEADLY_FROST";
    if (value == 27) return "Trap.BASE_TYPE_DEADLY_GAS";
    if (value == 7) return "Trap.BASE_TYPE_DEADLY_HOLY";
    if (value == 35) return "Trap.BASE_TYPE_DEADLY_NEGATIVE";
    if (value == 39) return "Trap.BASE_TYPE_DEADLY_SONIC";
    if (value == 3) return "Trap.BASE_TYPE_DEADLY_SPIKE";
    if (value == 11) return "Trap.BASE_TYPE_DEADLY_TANGLE";
    if (value == 44) return "Trap.BASE_TYPE_EPIC_ELECTRICAL";
    if (value == 45) return "Trap.BASE_TYPE_EPIC_FIRE";
    if (value == 46) return "Trap.BASE_TYPE_EPIC_FROST";
    if (value == 47) return "Trap.BASE_TYPE_EPIC_SONIC";
    if (value == 12) return "Trap.BASE_TYPE_MINOR_ACID";
    if (value == 40) return "Trap.BASE_TYPE_MINOR_ACID_SPLASH";
    if (value == 20) return "Trap.BASE_TYPE_MINOR_ELECTRICAL";
    if (value == 16) return "Trap.BASE_TYPE_MINOR_FIRE";
    if (value == 28) return "Trap.BASE_TYPE_MINOR_FROST";
    if (value == 24) return "Trap.BASE_TYPE_MINOR_GAS";
    if (value == 4) return "Trap.BASE_TYPE_MINOR_HOLY";
    if (value == 32) return "Trap.BASE_TYPE_MINOR_NEGATIVE";
    if (value == 36) return "Trap.BASE_TYPE_MINOR_SONIC";
    if (value == 0) return "Trap.BASE_TYPE_MINOR_SPIKE";
    if (value == 8) return "Trap.BASE_TYPE_MINOR_TANGLE";
    if (value == 14) return "Trap.BASE_TYPE_STRONG_ACID";
    if (value == 42) return "Trap.BASE_TYPE_STRONG_ACID_SPLASH";
    if (value == 22) return "Trap.BASE_TYPE_STRONG_ELECTRICAL";
    if (value == 18) return "Trap.BASE_TYPE_STRONG_FIRE";
    if (value == 30) return "Trap.BASE_TYPE_STRONG_FROST";
    if (value == 26) return "Trap.BASE_TYPE_STRONG_GAS";
    if (value == 6) return "Trap.BASE_TYPE_STRONG_HOLY";
    if (value == 34) return "Trap.BASE_TYPE_STRONG_NEGATIVE";
    if (value == 38) return "Trap.BASE_TYPE_STRONG_SONIC";
    if (value == 2) return "Trap.BASE_TYPE_STRONG_SPIKE";
    if (value == 10) return "Trap.BASE_TYPE_STRONG_TANGLE";
    return "Trap.(not found: " + value + ")";
  }

  public static String nameOf(float value) {
    return "Trap.(not found: " + value + ")";
  }

  public static String nameOf(String value) {
    return "Trap.(not found: " + value + ")";
  }
}

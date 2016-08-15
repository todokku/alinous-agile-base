/* Generated By:JavaCC: Do not edit this line. AlinousScriptParserConstants.java */
package org.alinous.parser.script;

public interface AlinousScriptParserConstants {

  int EOF = 0;
  int NOTASCII = 5;
  int ASCILETTER = 6;
  int NUMBERLETTER = 7;
  int CHARACTOR = 8;
  int SEMI_COLON = 9;
  int EQUALS = 10;
  int ASTERISK = 11;
  int PLUSPLUS = 12;
  int PLUS = 13;
  int MINUSMINUS = 14;
  int MINUS = 15;
  int DIV = 16;
  int MODULO = 17;
  int LOGICAL_AND = 18;
  int LOGICAL_OR = 19;
  int BIT_AND = 20;
  int BIT_OR = 21;
  int L_PARENTHESIS = 22;
  int R_PARENTHESIS = 23;
  int L_BRACKET = 24;
  int R_BRACKET = 25;
  int DOLLAR = 26;
  int DOT = 27;
  int COMMA = 28;
  int SQL_NOT_EQUALS = 29;
  int AT_AT_MARK = 30;
  int AT_MARK = 31;
  int L_BRACE = 32;
  int R_BRACE = 33;
  int CMP_EQUALS = 34;
  int CMP_NOTEQUALS = 35;
  int GT = 36;
  int GEQ = 37;
  int LT = 38;
  int LEQ = 39;
  int NOT = 40;
  int COLON = 41;
  int SELECT = 42;
  int INSERT = 43;
  int UPDATE = 44;
  int DELETE = 45;
  int INTO = 46;
  int FROM = 47;
  int WHERE = 48;
  int OR = 49;
  int AND = 50;
  int LIKE = 51;
  int ESCAPE = 52;
  int LEFT = 53;
  int RIGHT = 54;
  int NATURAL = 55;
  int INNER = 56;
  int OUTER = 57;
  int FULL = 58;
  int JOIN = 59;
  int CROSS = 60;
  int SET = 61;
  int VALUES = 62;
  int IF = 63;
  int ELSE = 64;
  int GROUP = 65;
  int BY = 66;
  int HAVING = 67;
  int ORDER = 68;
  int ASC = 69;
  int DESC = 70;
  int LIMIT = 71;
  int OFFSET = 72;
  int ON = 73;
  int SQL_NOT = 74;
  int AS = 75;
  int DISTINCT = 76;
  int SHARE = 77;
  int NOWAIT = 78;
  int OF = 79;
  int IN = 80;
  int BETWEEN = 81;
  int IS = 82;
  int BEGIN = 83;
  int PREPARE = 84;
  int TRANSACTION = 85;
  int ISOLATION = 86;
  int LEVEL = 87;
  int COMMIT = 88;
  int PREPARED = 89;
  int END = 90;
  int ROLLBACK = 91;
  int CREATE = 92;
  int DROP = 93;
  int ALTER = 94;
  int TABLE = 95;
  int SQL_DEFAULT = 96;
  int ADD = 97;
  int RENAME = 98;
  int COLUMN = 99;
  int TO = 100;
  int PRIMARY = 101;
  int KEY = 102;
  int UNIQUE = 103;
  int CHECK = 104;
  int RETURNS = 105;
  int SETOF = 106;
  int LANGUAGE = 107;
  int REPLACE = 108;
  int INDEX = 109;
  int USING = 110;
  int EACH = 111;
  int ROW = 112;
  int STATEMENT = 113;
  int EXECUTE = 114;
  int PROCEDURE = 115;
  int EXISTS = 116;
  int TRIGGER = 117;
  int BEFORE = 118;
  int AFTER = 119;
  int FOREIGN = 120;
  int REFERENCES = 121;
  int ADJUST_WHERE = 122;
  int ADJUST_SET = 123;
  int TRUE = 124;
  int FALSE = 125;
  int BOOL = 126;
  int NULL = 127;
  int FUNCTION = 128;
  int RETURN = 129;
  int USE = 130;
  int WHILE = 131;
  int DO = 132;
  int FOR = 133;
  int BREAK = 134;
  int CONTINUE = 135;
  int TRY = 136;
  int CATCH = 137;
  int FINALLY = 138;
  int DOWNLOAD = 139;
  int REDIRECT = 140;
  int INCLUDE = 141;
  int REFERER_FROM = 142;
  int VALIDATOR = 143;
  int SYNCHRONIZED = 144;
  int THROW = 145;
  int PARALLEL = 146;
  int LOCAL = 147;
  int IDENTIFIER = 148;
  int NUMERIC = 149;
  int DOUBLE = 150;
  int DQSTRLIT = 159;
  int SQSTRLIT = 163;

  int DEFAULT = 0;
  int SQ_STR = 1;
  int DQ_STR = 2;
  int COMM = 3;
  int L_COMM = 4;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<NOTASCII>",
    "<ASCILETTER>",
    "<NUMBERLETTER>",
    "<CHARACTOR>",
    "\";\"",
    "\"=\"",
    "\"*\"",
    "\"++\"",
    "\"+\"",
    "\"--\"",
    "\"-\"",
    "\"/\"",
    "\"%\"",
    "\"&&\"",
    "\"||\"",
    "\"&\"",
    "\"|\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"$\"",
    "\".\"",
    "\",\"",
    "\"<>\"",
    "\"@@\"",
    "\"@\"",
    "\"{\"",
    "\"}\"",
    "\"==\"",
    "\"!=\"",
    "\">\"",
    "\">=\"",
    "\"<\"",
    "\"<=\"",
    "\"!\"",
    "\":\"",
    "\"SELECT\"",
    "\"INSERT\"",
    "\"UPDATE\"",
    "\"DELETE\"",
    "\"INTO\"",
    "\"FROM\"",
    "\"WHERE\"",
    "\"OR\"",
    "\"AND\"",
    "\"LIKE\"",
    "\"<ESCAPE>\"",
    "\"LEFT\"",
    "\"RIGHT\"",
    "\"NATURAL\"",
    "\"INNER\"",
    "\"OUTER\"",
    "\"FULL\"",
    "\"JOIN\"",
    "\"CROSS\"",
    "\"SET\"",
    "\"VALUES\"",
    "\"IF\"",
    "\"ELSE\"",
    "\"GROUP\"",
    "\"BY\"",
    "\"HAVING\"",
    "\"ORDER\"",
    "\"ASC\"",
    "\"DESC\"",
    "\"LIMIT\"",
    "\"OFFSET\"",
    "\"ON\"",
    "\"NOT\"",
    "\"AS\"",
    "\"DISTINCT\"",
    "\"SHARE\"",
    "\"NOWAIT\"",
    "\"OF\"",
    "\"IN\"",
    "\"BETWEEN\"",
    "\"IS\"",
    "\"BEGIN\"",
    "\"PREPARE\"",
    "\"TRANSACTION\"",
    "\"ISOLATION\"",
    "\"LEVEL\"",
    "\"COMMIT\"",
    "\"PREPARED\"",
    "\"END\"",
    "\"ROLLBACK\"",
    "\"CREATE\"",
    "\"DROP\"",
    "\"ALTER\"",
    "\"TABLE\"",
    "\"DEFAULT\"",
    "\"ADD\"",
    "\"RENAME\"",
    "\"COLUMN\"",
    "\"TO\"",
    "\"PRIMARY\"",
    "\"KEY\"",
    "\"UNIQUE\"",
    "\"CHECK\"",
    "\"RETURNS\"",
    "\"SETOF\"",
    "\"LANGUAGE\"",
    "\"REPLACE\"",
    "\"INDEX\"",
    "\"USING\"",
    "\"EACH\"",
    "\"ROW\"",
    "\"STATEMENT\"",
    "\"EXECUTE\"",
    "\"PROCEDURE\"",
    "\"EXISTS\"",
    "\"TRIGGER\"",
    "\"BEFORE\"",
    "\"AFTER\"",
    "\"FOREIGN\"",
    "\"REFERENCES\"",
    "\"ADJUST_WHERE\"",
    "\"ADJUST_SET\"",
    "\"TRUE\"",
    "\"FALSE\"",
    "\"BOOL\"",
    "\"NULL\"",
    "\"FUNCTION\"",
    "\"RETURN\"",
    "\"USE\"",
    "\"WHILE\"",
    "\"DO\"",
    "\"FOR\"",
    "\"BREAK\"",
    "\"CONTINUE\"",
    "\"TRY\"",
    "\"CATCH\"",
    "\"FINALLY\"",
    "\"download\"",
    "\"redirect\"",
    "\"include\"",
    "\"refer_from\"",
    "\"validator\"",
    "\"synchronized\"",
    "\"throw\"",
    "\"parallel\"",
    "\"local\"",
    "<IDENTIFIER>",
    "<NUMERIC>",
    "<DOUBLE>",
    "\"\\\"\"",
    "\"\\\'\"",
    "\"/*\"",
    "\"//\"",
    "\"\\n\"",
    "<token of kind 156>",
    "\"*/\"",
    "<token of kind 158>",
    "\"\\\"\"",
    "\"\\\\\\\\\"",
    "\"\\\\\\\"\"",
    "<token of kind 162>",
    "\"\\\'\"",
    "\"\\\'\\\'\"",
    "\"\\\\\\\\\"",
    "\"\\\\\\\'\"",
    "<token of kind 167>",
  };

}

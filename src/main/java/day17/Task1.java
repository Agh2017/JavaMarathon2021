package day17;

import java.sql.Array;
import java.util.Arrays;

import static day17.ChessPiece.PAWN_WHITE;
import static day17.ChessPiece.ROOK_BLACK;

/*

 Создайте Enum “Шахматная фигура” (англ. ChessPiece).
Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook), слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
Ценность фигуры - вещественное число
Строковое обозначение фигуры

В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных. Названия фигур в перечислении должны иметь следующий вид:
KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее

У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.

Ценности шахматных фигур приведены в таблице:
Пешка  1
Конь   3
Слон   3.5
Ладья  5

 */
public class Task1 {

    private static final int count = 4;

    public static void main(String[] args) {

        String[] array = new String[8];
        for (int i = 0, j = 7; i < count; i++, j--) {
            array[i] = PAWN_WHITE.getShapeDescription();
            array[j] = ROOK_BLACK.getShapeDescription();
        }

        for (String shape : array) {
            System.out.print(shape+" ");
        }




    }
}
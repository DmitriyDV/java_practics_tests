package Day17;

/*
* Добавьте новую “фигуру” в enum ChessPiece,
* которая будет называться EMPTY. 
* Эта “фигура” будет обозначать пустое пространство
*  на шахматной доске. Ценность этой фигуры равна -1,
*  а строковое обозначение равно нижнему подчеркиванию ("_"). 
* Затем создайте класс Шахматная доска (англ. ChessBoard). 
* Этот класс в единственном аргументе конструктора должен принимать
*  на вход двумерный массив шахматных фигур. Этот двумерный массив 
* задает конфигурацию фигур на шахматной доске. Пустое пространство 
* на шахматной доске задается с помощью значения EMPTY.Также,
*  у класса ChessBoard должен быть реализован метод print(),
*  который выводит шахматную доску в консоль.
В методе main()класса Task2создайте новый объект класса
*  ChessBoard, передав ему в качестве аргумента двумерный массив
*  с расположением фигур как на картинке ниже (матч Крамник - Каспаров 2000 года).
Затем, используя метод print()выведите шахматную доску в консоль, 
* используя строковые обозначения шахматных фигур.
* */
public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard(new ChessPiece[][]{
                {ChessPiece.ROCK_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROCK_BLACK, ChessPiece.EMPTY, ChessPiece.KING_BLACK},
                {ChessPiece.EMPTY, ChessPiece.ROCK_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK, ChessPiece.EMPTY, ChessPiece.KNIGHT_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.PAWN_BLACK, ChessPiece.EMPTY},
                {ChessPiece.QUEEN_BLACK, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_BLACK, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.BISHOP_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY},
                {ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.QUEEN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE, ChessPiece.EMPTY, ChessPiece.PAWN_WHITE},
                {ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.EMPTY, ChessPiece.ROCK_WHITE, ChessPiece.KING_WHITE, ChessPiece.EMPTY}
        });

        chessBoard.print();
    }
}

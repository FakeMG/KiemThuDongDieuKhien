public class StudentRanking {
    public static String GetStudentRank(double GPA, double diemRenLuyen) {
        if (GPA >= 3.6 && diemRenLuyen >= 90) return "Xuất sắc";
        if (GPA >= 3.2 && diemRenLuyen >= 80) return "Giỏi";
        return "Không có";
    }
}
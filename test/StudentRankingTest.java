import org.junit.Test;

import static org.junit.Assert.*;

public class StudentRankingTest {
    @Test
    public void GPA2_DRL50_KhongCo() {
        String result = StudentRanking.GetStudentRank(2, 50);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA2_DRL0_KhongCo() {
        String result = StudentRanking.GetStudentRank(2, 0);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA2_DRL1_KhongCo() {
        String result = StudentRanking.GetStudentRank(2, 1);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA2_DRL100_KhongCo() {
        String result = StudentRanking.GetStudentRank(2, 100);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA2_DRL99_KhongCo() {
        String result = StudentRanking.GetStudentRank(2, 99);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA0_DRL50_KhongCo() {
        String result = StudentRanking.GetStudentRank(0, 50);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA0point1_DRL50_KhongCo() {
        String result = StudentRanking.GetStudentRank(1, 50);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA4_DRL50_KhongCo() {
        String result = StudentRanking.GetStudentRank(4, 50);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA3point9_DRL50_KhongCo() {
        String result = StudentRanking.GetStudentRank(3.9, 50);
        assertEquals("Không có", result);
    }

    @Test
    public void GPA3point8_DRL95_XuatSac() {
        String result = StudentRanking.GetStudentRank(3.8, 95);
        assertEquals("Xuất sắc", result);
    }

    @Test
    public void GPA3point4_DRL85_Gioi() {
        String result = StudentRanking.GetStudentRank(3.4, 85);
        assertEquals("Giỏi", result);
    }

    @Test
    public void GPA2_DRL40_KhongCo() {
        String result = StudentRanking.GetStudentRank(2, 40);
        assertEquals("Không có", result);
    }
}
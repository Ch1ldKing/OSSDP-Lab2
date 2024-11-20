import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Solution2Test {

    @Test
    public void testExampleCases() {
        Solution2 solution = new Solution2();

        // 示例 1
        assertEquals("abc", solution.removeDuplicateLetters("bcabc"));

        // 示例 2
        assertEquals("acdb", solution.removeDuplicateLetters("cbacdcbc"));
    }

    @Test
    public void testEdgeCases() {
        Solution2 solution = new Solution2();

        // 空字符串
        assertEquals("", solution.removeDuplicateLetters(""));

        // 单字符
        assertEquals("a", solution.removeDuplicateLetters("a"));

        // 重复单字符
        assertEquals("a", solution.removeDuplicateLetters("aaaa"));

        // 按字典序排列的字符串
        assertEquals("abcdef", solution.removeDuplicateLetters("abcdef"));

        // 全部相同的重复字符
        assertEquals("a", solution.removeDuplicateLetters("aaaaaaa"));

        // 字母反序
        assertEquals("abcdef", solution.removeDuplicateLetters("fedcbaabcdef"));
    }

    @Test
    public void testLargeInput() {
        Solution2 solution = new Solution2();

        // 较大的输入
        String largeInput = "zxy" + "abcdefghijklmnopqrstuvwxyz".repeat(1000);
        String expectedOutput = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expectedOutput, solution.removeDuplicateLetters(largeInput));
    }

    @Test
    public void testPerformance() {
        Solution2 solution = new Solution2();

        // 极限输入测试，长度为 10^4
        String extremeInput = "z".repeat(10000);
        String expectedOutput = "z";
        assertEquals(expectedOutput, solution.removeDuplicateLetters(extremeInput));
    }
}

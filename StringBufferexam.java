public class StringBufferexam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        // sb.append("hello");
        // sb.append(" ");
        // sb.append("jump to java");
        // System.out.println(sb.toString());

        // sb.append("jump to java");
        // sb.insert(0,"hello");
        // System.out.println(sb.toString());

        sb.append("Hello jump to java");
        System.out.println(sb.substring(0, 4));
    }
}

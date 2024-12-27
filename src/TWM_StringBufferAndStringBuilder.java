public class TWM_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Maseera");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Sayed");
        String str = sb.toString();

        sb.insert(8,"Java ");
        sb.setLength(30);
        sb.ensureCapacity(100);
        //sb.deleteCharAt(0);
        System.out.println(sb);
    }
}

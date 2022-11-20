// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import java.nio.ShortBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.IOException;
import okio.ByteString;
import okhttp3.internal._UtilCommonKt;
import fk2.f;
import java.util.Arrays;
import ng2.e;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/http2/Huffman;", "", "", "symbol", "code", "codeBitCount", "Lcg2/j;", "addCode", "Lokio/ByteString;", "source", "Lfk2/e;", "sink", "encode", "bytes", "encodedLength", "Lfk2/f;", "", "byteCount", "decode", "", "CODES", "[I", "", "CODE_BIT_COUNTS", "[B", "Lokhttp3/internal/http2/Huffman$Node;", "root", "Lokhttp3/internal/http2/Huffman$Node;", "<init>", "()V", "Node", "okhttp" }, k = 1, mv = { 1, 6, 0 })
public final class Huffman
{
    private static final int[] CODES;
    private static final byte[] CODE_BIT_COUNTS;
    public static final Huffman INSTANCE;
    private static final Node root;
    
    static {
        INSTANCE = new Huffman();
        CODES = $d2j$hex$88d22d31$decode_I("f81f0000d8ff7f00e2ffff0fe3ffff0fe4ffff0fe5ffff0fe6ffff0fe7ffff0fe8ffff0feaffff00fcffff3fe9ffff0feaffff0ffdffff3febffff0fecffff0fedffff0feeffff0fefffff0ff0ffff0ff1ffff0ff2ffff0ffeffff3ff3ffff0ff4ffff0ff5ffff0ff6ffff0ff7ffff0ff8ffff0ff9ffff0ffaffff0ffbffff0f14000000f8030000f9030000fa0f0000f91f000015000000f8000000fa070000fa030000fb030000f9000000fb070000fa000000160000001700000018000000000000000100000002000000190000001a0000001b0000001c0000001d0000001e0000001f0000005c000000fb000000fc7f000020000000fb0f0000fc030000fa1f0000210000005d0000005e0000005f000000600000006100000062000000630000006400000065000000660000006700000068000000690000006a0000006b0000006c0000006d0000006e0000006f000000700000007100000072000000fc00000073000000fd000000fb1f0000f0ff0700fc1f0000fc3f000022000000fd7f0000030000002300000004000000240000000500000025000000260000002700000006000000740000007500000028000000290000002a000000070000002b000000760000002c00000008000000090000002d0000007700000078000000790000007a0000007b000000fe7f0000fc070000fd3f0000fd1f0000fcffff0fe6ff0f00d2ff3f00e7ff0f00e8ff0f00d3ff3f00d4ff3f00d5ff3f00d9ff7f00d6ff3f00daff7f00dbff7f00dcff7f00ddff7f00deff7f00ebffff00dfff7f00ecffff00edffff00d7ff3f00e0ff7f00eeffff00e1ff7f00e2ff7f00e3ff7f00e4ff7f00dcff1f00d8ff3f00e5ff7f00d9ff3f00e6ff7f00e7ff7f00efffff00daff3f00ddff1f00e9ff0f00dbff3f00dcff3f00e8ff7f00e9ff7f00deff1f00eaff7f00ddff3f00deff3f00f0ffff00dfff1f00dfff3f00ebff7f00ecff7f00e0ff1f00e1ff1f00e0ff3f00e2ff1f00edff7f00e1ff3f00eeff7f00efff7f00eaff0f00e2ff3f00e3ff3f00e4ff3f00f0ff7f00e5ff3f00e6ff3f00f1ff7f00e0ffff03e1ffff03ebff0f00f1ff0700e7ff3f00f2ff7f00e8ff3f00ecffff01e2ffff03e3ffff03e4ffff03deffff07dfffff07e5ffff03f1ffff00edffff01f2ff0700e3ff1f00e6ffff03e0ffff07e1ffff07e7ffff03e2ffff07f2ffff00e4ff1f00e5ff1f00e8ffff03e9ffff03fdffff0fe3ffff07e4ffff07e5ffff07ecff0f00f3ffff00edff0f00e6ff1f00e9ff3f00e7ff1f00e8ff1f00f3ff7f00eaff3f00ebff3f00eeffff01efffff01f4ffff00f5ffff00eaffff03f4ff7f00ebffff03e6ffff07ecffff03edffff03e7ffff07e8ffff07e9ffff07eaffff07ebffff07feffff0fecffff07edffff07eeffff07efffff07f0ffff07eeffff03");
        final byte[] array;
        final byte[] code_BIT_COUNTS = array = new byte[256];
        array[0] = 13;
        array[1] = 23;
        array[2] = 28;
        array[4] = (array[3] = 28);
        array[6] = (array[5] = 28);
        array[8] = (array[7] = 28);
        array[9] = 24;
        array[10] = 30;
        array[12] = (array[11] = 28);
        array[13] = 30;
        array[15] = (array[14] = 28);
        array[17] = (array[16] = 28);
        array[19] = (array[18] = 28);
        array[21] = (array[20] = 28);
        array[22] = 30;
        array[23] = 28;
        array[25] = (array[24] = 28);
        array[27] = (array[26] = 28);
        array[29] = (array[28] = 28);
        array[31] = (array[30] = 28);
        array[32] = 6;
        array[34] = (array[33] = 10);
        array[35] = 12;
        array[36] = 13;
        array[37] = 6;
        array[38] = 8;
        array[39] = 11;
        array[41] = (array[40] = 10);
        array[42] = 8;
        array[43] = 11;
        array[44] = 8;
        array[45] = 6;
        array[47] = (array[46] = 6);
        array[48] = 5;
        array[50] = (array[49] = 5);
        array[51] = 6;
        array[53] = (array[52] = 6);
        array[55] = (array[54] = 6);
        array[57] = (array[56] = 6);
        array[58] = 7;
        array[59] = 8;
        array[60] = 15;
        array[61] = 6;
        array[62] = 12;
        array[63] = 10;
        array[64] = 13;
        array[65] = 6;
        array[67] = (array[66] = 7);
        array[69] = (array[68] = 7);
        array[71] = (array[70] = 7);
        array[73] = (array[72] = 7);
        array[75] = (array[74] = 7);
        array[77] = (array[76] = 7);
        array[79] = (array[78] = 7);
        array[81] = (array[80] = 7);
        array[83] = (array[82] = 7);
        array[85] = (array[84] = 7);
        array[87] = (array[86] = 7);
        array[88] = 8;
        array[89] = 7;
        array[90] = 8;
        array[91] = 13;
        array[92] = 19;
        array[93] = 13;
        array[94] = 14;
        array[95] = 6;
        array[96] = 15;
        array[97] = 5;
        array[98] = 6;
        array[99] = 5;
        array[100] = 6;
        array[101] = 5;
        array[102] = 6;
        array[104] = (array[103] = 6);
        array[105] = 5;
        array[107] = (array[106] = 7);
        array[108] = 6;
        array[110] = (array[109] = 6);
        array[111] = 5;
        array[112] = 6;
        array[113] = 7;
        array[114] = 6;
        array[116] = (array[115] = 5);
        array[117] = 6;
        array[118] = 7;
        array[120] = (array[119] = 7);
        array[122] = (array[121] = 7);
        array[123] = 15;
        array[124] = 11;
        array[125] = 14;
        array[126] = 13;
        array[127] = 28;
        array[128] = 20;
        array[129] = 22;
        array[131] = (array[130] = 20);
        array[132] = 22;
        array[134] = (array[133] = 22);
        array[135] = 23;
        array[136] = 22;
        array[137] = 23;
        array[139] = (array[138] = 23);
        array[141] = (array[140] = 23);
        array[142] = 24;
        array[143] = 23;
        array[145] = (array[144] = 24);
        array[146] = 22;
        array[147] = 23;
        array[148] = 24;
        array[150] = (array[149] = 23);
        array[152] = (array[151] = 23);
        array[153] = 21;
        array[154] = 22;
        array[155] = 23;
        array[156] = 22;
        array[158] = (array[157] = 23);
        array[159] = 24;
        array[160] = 22;
        array[161] = 21;
        array[162] = 20;
        array[164] = (array[163] = 22);
        array[166] = (array[165] = 23);
        array[167] = 21;
        array[168] = 23;
        array[170] = (array[169] = 22);
        array[171] = 24;
        array[172] = 21;
        array[173] = 22;
        array[175] = (array[174] = 23);
        array[177] = (array[176] = 21);
        array[178] = 22;
        array[179] = 21;
        array[180] = 23;
        array[181] = 22;
        array[183] = (array[182] = 23);
        array[184] = 20;
        array[185] = 22;
        array[187] = (array[186] = 22);
        array[188] = 23;
        array[190] = (array[189] = 22);
        array[191] = 23;
        array[193] = (array[192] = 26);
        array[194] = 20;
        array[195] = 19;
        array[196] = 22;
        array[197] = 23;
        array[198] = 22;
        array[199] = 25;
        array[200] = 26;
        array[202] = (array[201] = 26);
        array[204] = (array[203] = 27);
        array[205] = 26;
        array[206] = 24;
        array[207] = 25;
        array[208] = 19;
        array[209] = 21;
        array[210] = 26;
        array[212] = (array[211] = 27);
        array[213] = 26;
        array[214] = 27;
        array[215] = 24;
        array[217] = (array[216] = 21);
        array[219] = (array[218] = 26);
        array[220] = 28;
        array[221] = 27;
        array[223] = (array[222] = 27);
        array[224] = 20;
        array[225] = 24;
        array[226] = 20;
        array[227] = 21;
        array[228] = 22;
        array[230] = (array[229] = 21);
        array[231] = 23;
        array[233] = (array[232] = 22);
        array[235] = (array[234] = 25);
        array[237] = (array[236] = 24);
        array[238] = 26;
        array[239] = 23;
        array[240] = 26;
        array[241] = 27;
        array[243] = (array[242] = 26);
        array[244] = 27;
        array[246] = (array[245] = 27);
        array[248] = (array[247] = 27);
        array[249] = 28;
        array[250] = 27;
        array[252] = (array[251] = 27);
        array[254] = (array[253] = 27);
        array[255] = 26;
        CODE_BIT_COUNTS = code_BIT_COUNTS;
        root = new Node();
        for (int length = code_BIT_COUNTS.length, i = 0; i < length; ++i) {
            Huffman.INSTANCE.addCode(i, Huffman.CODES[i], Huffman.CODE_BIT_COUNTS[i]);
        }
    }
    
    private Huffman() {
    }
    
    private final void addCode(int n, int n2, int i) {
        final Node node = new Node(n, i);
        Node root = Huffman.root;
        while (i > 8) {
            i -= 8;
            n = (n2 >>> i & 0xFF);
            final Node[] children = root.getChildren();
            e.c((Object)children);
            if ((root = children[n]) == null) {
                root = new Node();
                children[n] = root;
            }
        }
        n = 8 - i;
        n2 = (n2 << n & 0xFF);
        final Node[] children2 = root.getChildren();
        e.c((Object)children2);
        Arrays.fill(children2, n2, (1 << n) + n2, node);
    }
    
    public final void decode(final f f, final long n, final fk2.e e) {
        e.f((Object)f, "source");
        e.f((Object)e, "sink");
        Node root = Huffman.root;
        int n2 = 0;
        long n3 = 0L;
        int n4 = 0;
        Node root2;
        int i;
        while (true) {
            root2 = root;
            i = n4;
            if (n3 >= n) {
                break;
            }
            final long n5 = n3 + 1L;
            final int n6 = n2 << 8 | _UtilCommonKt.and(f.readByte(), 255);
            int n7 = n4 + 8;
            Node root3 = root;
            while (true) {
                root = root3;
                n2 = n6;
                n4 = n7;
                n3 = n5;
                if (n7 < 8) {
                    break;
                }
                final Node[] children = root3.getChildren();
                e.c((Object)children);
                root3 = children[n6 >>> n7 - 8 & 0xFF];
                e.c((Object)root3);
                if (root3.getChildren() == null) {
                    e.writeByte(root3.getSymbol());
                    n7 -= root3.getTerminalBitCount();
                    root3 = Huffman.root;
                }
                else {
                    n7 -= 8;
                }
            }
        }
        while (i > 0) {
            final Node[] children2 = root2.getChildren();
            e.c((Object)children2);
            final Node node = children2[n2 << 8 - i & 0xFF];
            e.c((Object)node);
            if (node.getChildren() != null) {
                break;
            }
            if (node.getTerminalBitCount() > i) {
                break;
            }
            e.writeByte(node.getSymbol());
            i -= node.getTerminalBitCount();
            root2 = Huffman.root;
        }
    }
    
    public final void encode(final ByteString byteString, final fk2.e e) throws IOException {
        e.f((Object)byteString, "source");
        e.f((Object)e, "sink");
        final int size = byteString.size();
        int i = 0;
        long n = 0L;
        int j = 0;
        while (i < size) {
            final int and = _UtilCommonKt.and(byteString.getByte(i), 255);
            final int n2 = Huffman.CODES[and];
            final byte b = Huffman.CODE_BIT_COUNTS[and];
            n = (n << b | (long)n2);
            j += b;
            while (j >= 8) {
                j -= 8;
                e.writeByte((int)(n >> j));
            }
            ++i;
        }
        if (j > 0) {
            e.writeByte((int)(n << 8 - j | 255L >>> j));
        }
    }
    
    public final int encodedLength(final ByteString byteString) {
        e.f((Object)byteString, "bytes");
        final int size = byteString.size();
        long n = 0L;
        for (int i = 0; i < size; ++i) {
            n += Huffman.CODE_BIT_COUNTS[_UtilCommonKt.and(byteString.getByte(i), 255)];
        }
        return (int)(n + 7 >> 3);
    }
    
    private static long[] $d2j$hex$88d22d31$decode_J(final String src) {
        final byte[] d = $d2j$hex$88d22d31$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final LongBuffer s = b.asLongBuffer();
        final long[] data = new long[d.length / 8];
        s.get(data);
        return data;
    }
    
    private static int[] $d2j$hex$88d22d31$decode_I(final String src) {
        final byte[] d = $d2j$hex$88d22d31$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final IntBuffer s = b.asIntBuffer();
        final int[] data = new int[d.length / 4];
        s.get(data);
        return data;
    }
    
    private static short[] $d2j$hex$88d22d31$decode_S(final String src) {
        final byte[] d = $d2j$hex$88d22d31$decode_B(src);
        final ByteBuffer b = ByteBuffer.wrap(d);
        b.order(ByteOrder.LITTLE_ENDIAN);
        final ShortBuffer s = b.asShortBuffer();
        final short[] data = new short[d.length / 2];
        s.get(data);
        return data;
    }
    
    private static byte[] $d2j$hex$88d22d31$decode_B(final String src) {
        final char[] d = src.toCharArray();
        final byte[] ret = new byte[src.length() / 2];
        for (int i = 0; i < ret.length; ++i) {
            final char h = d[2 * i];
            final char l = d[2 * i + 1];
            int hh;
            if (h >= '0' && h <= '9') {
                hh = h - '0';
            }
            else if (h >= 'a' && h <= 'f') {
                hh = h - 'a' + 10;
            }
            else {
                if (h < 'A' || h > 'F') {
                    throw new RuntimeException();
                }
                hh = h - 'A' + 10;
            }
            int ll;
            if (l >= '0' && l <= '9') {
                ll = l - '0';
            }
            else if (l >= 'a' && l <= 'f') {
                ll = l - 'a' + 10;
            }
            else {
                if (l < 'A' || l > 'F') {
                    throw new RuntimeException();
                }
                ll = l - 'A' + 10;
            }
            ret[i] = (byte)(hh << 4 | ll);
        }
        return ret;
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u001d\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010" }, d2 = { "Lokhttp3/internal/http2/Huffman$Node;", "", "()V", "symbol", "", "bits", "(II)V", "children", "", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "[Lokhttp3/internal/http2/Huffman$Node;", "getSymbol", "()I", "terminalBitCount", "getTerminalBitCount", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
    public static final class Node
    {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;
        
        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }
        
        public Node(int n, int n2) {
            this.children = null;
            this.symbol = n;
            n2 = (n = (n2 & 0x7));
            if (n2 == 0) {
                n = 8;
            }
            this.terminalBitCount = n;
        }
        
        public final Node[] getChildren() {
            return this.children;
        }
        
        public final int getSymbol() {
            return this.symbol;
        }
        
        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }
    }
}

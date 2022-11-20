// 
// Decompiled by Procyon v0.6.0
// 

package okhttp3.internal.http2;

import java.util.Arrays;
import fk2.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.internal._UtilCommonKt;
import ej2.t;
import dg2.j;
import fk2.u;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import fk2.g0;
import fk2.f;
import java.util.List;
import java.io.IOException;
import ng2.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import okio.ByteString;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a" }, d2 = { "Lokhttp3/internal/http2/Hpack;", "", "()V", "NAME_TO_FIRST_INDEX", "", "Lokio/ByteString;", "", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", "", "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", "okhttp" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public final class Hpack
{
    public static final Hpack INSTANCE;
    private static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;
    
    static {
        final Hpack hpack = INSTANCE = new Hpack();
        final Header header = new Header(Header.TARGET_AUTHORITY, "");
        final ByteString target_METHOD = Header.TARGET_METHOD;
        final Header header2 = new Header(target_METHOD, "GET");
        final Header header3 = new Header(target_METHOD, "POST");
        final ByteString target_PATH = Header.TARGET_PATH;
        final Header header4 = new Header(target_PATH, "/");
        final Header header5 = new Header(target_PATH, "/index.html");
        final ByteString target_SCHEME = Header.TARGET_SCHEME;
        final Header header6 = new Header(target_SCHEME, "http");
        final Header header7 = new Header(target_SCHEME, "https");
        final ByteString response_STATUS = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[] { header, header2, header3, header4, header5, header6, header7, new Header(response_STATUS, "200"), new Header(response_STATUS, "204"), new Header(response_STATUS, "206"), new Header(response_STATUS, "304"), new Header(response_STATUS, "400"), new Header(response_STATUS, "404"), new Header(response_STATUS, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "") };
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }
    
    private Hpack() {
    }
    
    private final Map<ByteString, Integer> nameToFirstIndex() {
        final Header[] static_HEADER_TABLE = Hpack.STATIC_HEADER_TABLE;
        final LinkedHashMap linkedHashMap = new LinkedHashMap(static_HEADER_TABLE.length);
        for (int length = static_HEADER_TABLE.length, i = 0; i < length; ++i) {
            final Header[] static_HEADER_TABLE2 = Hpack.STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(static_HEADER_TABLE2[i].name)) {
                linkedHashMap.put((Object)static_HEADER_TABLE2[i].name, (Object)i);
            }
        }
        final Map<Object, Object> unmodifiableMap = (Map<Object, Object>)Collections.unmodifiableMap((Map<? extends ByteString, ? extends Integer>)linkedHashMap);
        e.e((Object)unmodifiableMap, "unmodifiableMap(result)");
        return (Map<ByteString, Integer>)unmodifiableMap;
    }
    
    public final ByteString checkLowercase(final ByteString byteString) throws IOException {
        e.f((Object)byteString, "name");
        for (int size = byteString.size(), i = 0; i < size; ++i) {
            final byte b = 65;
            final byte b2 = 90;
            final byte byte1 = byteString.getByte(i);
            if (b <= byte1 && byte1 <= b2) {
                throw new IOException(e.l((Object)byteString.utf8(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
        return byteString;
    }
    
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return Hpack.NAME_TO_FIRST_INDEX;
    }
    
    public final Header[] getSTATIC_HEADER_TABLE() {
        return Hpack.STATIC_HEADER_TABLE;
    }
    
    @Metadata(bv = {}, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0010R\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u001a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140%8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010)\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b)\u0010!R\u0016\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010!¨\u0006/" }, d2 = { "Lokhttp3/internal/http2/Hpack$Reader;", "", "Lcg2/j;", "adjustDynamicTableByteCount", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "index", "readIndexedHeader", "dynamicTableIndex", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingIndexedName", "readLiteralHeaderWithIncrementalIndexingNewName", "Lokio/ByteString;", "getName", "", "isStaticHeader", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "readByte", "", "getAndResetHeaderList", "maxDynamicTableByteCount", "readHeaders", "firstByte", "prefixMask", "readInt", "readByteString", "headerTableSizeSetting", "I", "", "headerList", "Ljava/util/List;", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "Lfk2/g0;", "source", "<init>", "(Lfk2/g0;II)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public static final class Reader
    {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final f source;
        
        public Reader(final g0 g0, final int n) {
            e.f((Object)g0, "source");
            this(g0, n, 0, 4, null);
        }
        
        public Reader(final g0 g0, final int headerTableSizeSetting, final int maxDynamicTableByteCount) {
            e.f((Object)g0, "source");
            this.headerTableSizeSetting = headerTableSizeSetting;
            this.maxDynamicTableByteCount = maxDynamicTableByteCount;
            this.headerList = new ArrayList<Header>();
            this.source = (f)u.b(g0);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = 7;
        }
        
        public Reader(final g0 g0, final int n, int n2, final int n3, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n3 & 0x4) != 0x0) {
                n2 = n;
            }
            this(g0, n, n2);
        }
        
        private final void adjustDynamicTableByteCount() {
            final int maxDynamicTableByteCount = this.maxDynamicTableByteCount;
            final int dynamicTableByteCount = this.dynamicTableByteCount;
            if (maxDynamicTableByteCount < dynamicTableByteCount) {
                if (maxDynamicTableByteCount == 0) {
                    this.clearDynamicTable();
                }
                else {
                    this.evictToRecoverBytes(dynamicTableByteCount - maxDynamicTableByteCount);
                }
            }
        }
        
        private final void clearDynamicTable() {
            j.X1((Object[])this.dynamicTable, (t)null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }
        
        private final int dynamicTableIndex(final int n) {
            return this.nextHeaderIndex + 1 + n;
        }
        
        private final int evictToRecoverBytes(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4 = this.dynamicTable.length - 1;
                int n5 = n;
                n = n3;
                int nextHeaderIndex;
                while (true) {
                    nextHeaderIndex = this.nextHeaderIndex;
                    if (n4 < nextHeaderIndex || n5 <= 0) {
                        break;
                    }
                    final Header header = this.dynamicTable[n4];
                    e.c((Object)header);
                    final int hpackSize = header.hpackSize;
                    n5 -= hpackSize;
                    this.dynamicTableByteCount -= hpackSize;
                    --this.headerCount;
                    ++n;
                    --n4;
                }
                final Header[] dynamicTable = this.dynamicTable;
                System.arraycopy(dynamicTable, nextHeaderIndex + 1, dynamicTable, nextHeaderIndex + 1 + n, this.headerCount);
                this.nextHeaderIndex += n;
                n2 = n;
            }
            return n2;
        }
        
        private final ByteString getName(final int n) throws IOException {
            if (!this.isStaticHeader(n)) {
                final int dynamicTableIndex = this.dynamicTableIndex(n - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                if (dynamicTableIndex >= 0) {
                    final Header[] dynamicTable = this.dynamicTable;
                    if (dynamicTableIndex < dynamicTable.length) {
                        final Header header = dynamicTable[dynamicTableIndex];
                        e.c((Object)header);
                        return header.name;
                    }
                }
                throw new IOException(e.l((Object)(n + 1), "Header index too large "));
            }
            return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[n].name;
        }
        
        private final void insertIntoDynamicTable(int headerCount, final Header header) {
            this.headerList.add(header);
            int hpackSize;
            final int n = hpackSize = header.hpackSize;
            if (headerCount != -1) {
                final Header header2 = this.dynamicTable[this.dynamicTableIndex(headerCount)];
                e.c((Object)header2);
                hpackSize = n - header2.hpackSize;
            }
            final int maxDynamicTableByteCount = this.maxDynamicTableByteCount;
            if (hpackSize > maxDynamicTableByteCount) {
                this.clearDynamicTable();
                return;
            }
            final int evictToRecoverBytes = this.evictToRecoverBytes(this.dynamicTableByteCount + hpackSize - maxDynamicTableByteCount);
            if (headerCount == -1) {
                headerCount = this.headerCount;
                final Header[] dynamicTable = this.dynamicTable;
                if (headerCount + 1 > dynamicTable.length) {
                    final Header[] dynamicTable2 = new Header[dynamicTable.length * 2];
                    System.arraycopy(dynamicTable, 0, dynamicTable2, dynamicTable.length, dynamicTable.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = dynamicTable2;
                }
                headerCount = this.nextHeaderIndex--;
                this.dynamicTable[headerCount] = header;
                ++this.headerCount;
            }
            else {
                this.dynamicTable[this.dynamicTableIndex(headerCount) + evictToRecoverBytes + headerCount] = header;
            }
            this.dynamicTableByteCount += hpackSize;
        }
        
        private final boolean isStaticHeader(final int n) {
            boolean b = true;
            if (n < 0 || n > Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                b = false;
            }
            return b;
        }
        
        private final int readByte() throws IOException {
            return _UtilCommonKt.and(this.source.readByte(), 255);
        }
        
        private final void readIndexedHeader(final int n) throws IOException {
            if (!this.isStaticHeader(n)) {
                final int dynamicTableIndex = this.dynamicTableIndex(n - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                if (dynamicTableIndex >= 0) {
                    final Header[] dynamicTable = this.dynamicTable;
                    if (dynamicTableIndex < dynamicTable.length) {
                        final List<Header> headerList = this.headerList;
                        final Header header = dynamicTable[dynamicTableIndex];
                        e.c((Object)header);
                        headerList.add(header);
                        return;
                    }
                }
                throw new IOException(e.l((Object)(n + 1), "Header index too large "));
            }
            this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[n]);
        }
        
        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(final int n) throws IOException {
            this.insertIntoDynamicTable(-1, new Header(this.getName(n), this.readByteString()));
        }
        
        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            this.insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(this.readByteString()), this.readByteString()));
        }
        
        private final void readLiteralHeaderWithoutIndexingIndexedName(final int n) throws IOException {
            this.headerList.add(new Header(this.getName(n), this.readByteString()));
        }
        
        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(this.readByteString()), this.readByteString()));
        }
        
        public final List<Header> getAndResetHeaderList() {
            final List i5 = CollectionsKt___CollectionsKt.I5((Iterable)this.headerList);
            this.headerList.clear();
            return i5;
        }
        
        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }
        
        public final ByteString readByteString() throws IOException {
            final int byte1 = this.readByte();
            final boolean b = (byte1 & 0x80) == 0x80;
            final long n = this.readInt(byte1, 127);
            ByteString byteString;
            if (b) {
                final c c = new c();
                Huffman.INSTANCE.decode(this.source, n, (fk2.e)c);
                byteString = c.D1();
            }
            else {
                byteString = this.source.U0(n);
            }
            return byteString;
        }
        
        public final void readHeaders() throws IOException {
            while (!this.source.e1()) {
                final int and = _UtilCommonKt.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new IOException("index == 0");
                }
                if ((and & 0x80) == 0x80) {
                    this.readIndexedHeader(this.readInt(and, 127) - 1);
                }
                else if (and == 64) {
                    this.readLiteralHeaderWithIncrementalIndexingNewName();
                }
                else if ((and & 0x40) == 0x40) {
                    this.readLiteralHeaderWithIncrementalIndexingIndexedName(this.readInt(and, 63) - 1);
                }
                else if ((and & 0x20) == 0x20) {
                    final int int1 = this.readInt(and, 31);
                    this.maxDynamicTableByteCount = int1;
                    if (int1 < 0 || int1 > this.headerTableSizeSetting) {
                        throw new IOException(e.l((Object)this.maxDynamicTableByteCount, "Invalid dynamic table size update "));
                    }
                    this.adjustDynamicTableByteCount();
                }
                else if (and != 16 && and != 0) {
                    this.readLiteralHeaderWithoutIndexingIndexedName(this.readInt(and, 15) - 1);
                }
                else {
                    this.readLiteralHeaderWithoutIndexingNewName();
                }
            }
        }
        
        public final int readInt(int n, int n2) throws IOException {
            n &= n2;
            if (n < n2) {
                return n;
            }
            n = 0;
            int byte1;
            while (true) {
                byte1 = this.readByte();
                if ((byte1 & 0x80) == 0x0) {
                    break;
                }
                n2 += (byte1 & 0x7F) << n;
                n += 7;
            }
            return n2 + (byte1 << n);
        }
    }
    
    @Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0017¨\u0006(" }, d2 = { "Lokhttp3/internal/http2/Hpack$Writer;", "", "Lcg2/j;", "clearDynamicTable", "", "bytesToRecover", "evictToRecoverBytes", "Lokhttp3/internal/http2/Header;", "entry", "insertIntoDynamicTable", "adjustDynamicTableByteCount", "", "headerBlock", "writeHeaders", "value", "prefixMask", "bits", "writeInt", "Lokio/ByteString;", "data", "writeByteString", "headerTableSizeSetting", "resizeHeaderTable", "I", "", "useCompression", "Z", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "Lfk2/c;", "out", "<init>", "(IZLfk2/c;)V", "okhttp" }, k = 1, mv = { 1, 6, 0 })
    public static final class Writer
    {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final c out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;
        
        public Writer(final int n, final c c) {
            e.f((Object)c, "out");
            this(n, false, c, 2, null);
        }
        
        public Writer(final int n, final boolean useCompression, final c out) {
            e.f((Object)out, "out");
            this.headerTableSizeSetting = n;
            this.useCompression = useCompression;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = n;
            final Header[] dynamicTable = new Header[8];
            this.dynamicTable = dynamicTable;
            this.nextHeaderIndex = dynamicTable.length - 1;
        }
        
        public Writer(int n, boolean b, final c c, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n2 & 0x1) != 0x0) {
                n = 4096;
            }
            if ((n2 & 0x2) != 0x0) {
                b = true;
            }
            this(n, b, c);
        }
        
        public Writer(final c c) {
            e.f((Object)c, "out");
            this(0, false, c, 3, null);
        }
        
        private final void adjustDynamicTableByteCount() {
            final int maxDynamicTableByteCount = this.maxDynamicTableByteCount;
            final int dynamicTableByteCount = this.dynamicTableByteCount;
            if (maxDynamicTableByteCount < dynamicTableByteCount) {
                if (maxDynamicTableByteCount == 0) {
                    this.clearDynamicTable();
                }
                else {
                    this.evictToRecoverBytes(dynamicTableByteCount - maxDynamicTableByteCount);
                }
            }
        }
        
        private final void clearDynamicTable() {
            j.X1((Object[])this.dynamicTable, (t)null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }
        
        private final int evictToRecoverBytes(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4 = this.dynamicTable.length - 1;
                int n5 = n;
                n = n3;
                int nextHeaderIndex;
                while (true) {
                    nextHeaderIndex = this.nextHeaderIndex;
                    if (n4 < nextHeaderIndex || n5 <= 0) {
                        break;
                    }
                    final Header header = this.dynamicTable[n4];
                    e.c((Object)header);
                    n5 -= header.hpackSize;
                    final int dynamicTableByteCount = this.dynamicTableByteCount;
                    final Header header2 = this.dynamicTable[n4];
                    e.c((Object)header2);
                    this.dynamicTableByteCount = dynamicTableByteCount - header2.hpackSize;
                    --this.headerCount;
                    ++n;
                    --n4;
                }
                final Header[] dynamicTable = this.dynamicTable;
                System.arraycopy(dynamicTable, nextHeaderIndex + 1, dynamicTable, nextHeaderIndex + 1 + n, this.headerCount);
                final Header[] dynamicTable2 = this.dynamicTable;
                final int nextHeaderIndex2 = this.nextHeaderIndex;
                Arrays.fill(dynamicTable2, nextHeaderIndex2 + 1, nextHeaderIndex2 + 1 + n, null);
                this.nextHeaderIndex += n;
                n2 = n;
            }
            return n2;
        }
        
        private final void insertIntoDynamicTable(final Header header) {
            final int hpackSize = header.hpackSize;
            final int maxDynamicTableByteCount = this.maxDynamicTableByteCount;
            if (hpackSize > maxDynamicTableByteCount) {
                this.clearDynamicTable();
                return;
            }
            this.evictToRecoverBytes(this.dynamicTableByteCount + hpackSize - maxDynamicTableByteCount);
            final int headerCount = this.headerCount;
            final Header[] dynamicTable = this.dynamicTable;
            if (headerCount + 1 > dynamicTable.length) {
                final Header[] dynamicTable2 = new Header[dynamicTable.length * 2];
                System.arraycopy(dynamicTable, 0, dynamicTable2, dynamicTable.length, dynamicTable.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = dynamicTable2;
            }
            this.dynamicTable[this.nextHeaderIndex--] = header;
            ++this.headerCount;
            this.dynamicTableByteCount += hpackSize;
        }
        
        public final void resizeHeaderTable(int min) {
            this.headerTableSizeSetting = min;
            min = Math.min(min, 16384);
            final int maxDynamicTableByteCount = this.maxDynamicTableByteCount;
            if (maxDynamicTableByteCount == min) {
                return;
            }
            if (min < maxDynamicTableByteCount) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            this.adjustDynamicTableByteCount();
        }
        
        public final void writeByteString(ByteString d1) throws IOException {
            e.f((Object)d1, "data");
            if (this.useCompression) {
                final Huffman instance = Huffman.INSTANCE;
                if (instance.encodedLength(d1) < d1.size()) {
                    final c c = new c();
                    instance.encode(d1, (fk2.e)c);
                    d1 = c.D1();
                    this.writeInt(d1.size(), 127, 128);
                    this.out.R(d1);
                    return;
                }
            }
            this.writeInt(d1.size(), 127, 0);
            this.out.R(d1);
        }
        
        public final void writeHeaders(final List<Header> list) throws IOException {
            e.f((Object)list, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                final int smallestHeaderTableSizeSetting = this.smallestHeaderTableSizeSetting;
                if (smallestHeaderTableSizeSetting < this.maxDynamicTableByteCount) {
                    this.writeInt(smallestHeaderTableSizeSetting, 31, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                this.writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            for (int size = list.size(), i = 0; i < size; ++i) {
                final Header header = list.get(i);
                final ByteString asciiLowercase = header.name.toAsciiLowercase();
                final ByteString value = header.value;
                final Hpack instance = Hpack.INSTANCE;
                final Integer n = instance.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                int n2 = 0;
                int n3 = 0;
                Label_0230: {
                    if (n != null) {
                        n2 = n + 1;
                        if (2 <= n2 && n2 < 8) {
                            if (e.a((Object)instance.getSTATIC_HEADER_TABLE()[n2 - 1].value, (Object)value)) {
                                n3 = n2;
                                break Label_0230;
                            }
                            if (e.a((Object)instance.getSTATIC_HEADER_TABLE()[n2].value, (Object)value)) {
                                final int n4 = n2 + 1;
                                n3 = n2;
                                n2 = n4;
                                break Label_0230;
                            }
                        }
                        n3 = n2;
                        n2 = -1;
                    }
                    else {
                        n3 = -1;
                        n2 = -1;
                    }
                }
                int n5 = n3;
                int n6 = n2;
                if (n2 == -1) {
                    int n7 = this.nextHeaderIndex + 1;
                    final int length = this.dynamicTable.length;
                    while (true) {
                        n5 = n3;
                        n6 = n2;
                        if (n7 >= length) {
                            break;
                        }
                        final Header header2 = this.dynamicTable[n7];
                        e.c((Object)header2);
                        int n8 = n3;
                        if (e.a((Object)header2.name, (Object)asciiLowercase)) {
                            final Header header3 = this.dynamicTable[n7];
                            e.c((Object)header3);
                            if (e.a((Object)header3.value, (Object)value)) {
                                n6 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (n7 - this.nextHeaderIndex);
                                n5 = n3;
                                break;
                            }
                            if ((n8 = n3) == -1) {
                                n8 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (n7 - this.nextHeaderIndex);
                            }
                        }
                        ++n7;
                        n3 = n8;
                    }
                }
                if (n6 != -1) {
                    this.writeInt(n6, 127, 128);
                }
                else if (n5 == -1) {
                    this.out.S(64);
                    this.writeByteString(asciiLowercase);
                    this.writeByteString(value);
                    this.insertIntoDynamicTable(header);
                }
                else if (asciiLowercase.startsWith(Header.PSEUDO_PREFIX) && !e.a((Object)Header.TARGET_AUTHORITY, (Object)asciiLowercase)) {
                    this.writeInt(n5, 15, 0);
                    this.writeByteString(value);
                }
                else {
                    this.writeInt(n5, 63, 64);
                    this.writeByteString(value);
                    this.insertIntoDynamicTable(header);
                }
            }
        }
        
        public final void writeInt(int i, final int n, final int n2) {
            if (i < n) {
                this.out.S(i | n2);
                return;
            }
            this.out.S(n2 | n);
            for (i -= n; i >= 128; i >>>= 7) {
                this.out.S(0x80 | (i & 0x7F));
            }
            this.out.S(i);
        }
    }
}

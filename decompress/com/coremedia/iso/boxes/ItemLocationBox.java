// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import p1.h;
import b5.k;
import dg.l0;
import java.util.Iterator;
import java.util.Hashtable;
import com.googlecode.mp4parser.e;
import mt2.c;
import java.nio.ByteBuffer;
import mt2.b;
import java.util.LinkedList;
import java.util.List;
import lt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class ItemLocationBox extends AbstractFullBox
{
    public static final String TYPE = "iloc";
    private static final a ajc$tjp_0;
    private static final a ajc$tjp_1;
    private static final a ajc$tjp_10;
    private static final a ajc$tjp_11;
    private static final a ajc$tjp_2;
    private static final a ajc$tjp_3;
    private static final a ajc$tjp_4;
    private static final a ajc$tjp_5;
    private static final a ajc$tjp_6;
    private static final a ajc$tjp_7;
    private static final a ajc$tjp_8;
    private static final a ajc$tjp_9;
    public int baseOffsetSize;
    public int indexSize;
    public List<Item> items;
    public int lengthSize;
    public int offsetSize;
    
    static {
        ajc$preClinit();
    }
    
    public ItemLocationBox() {
        super("iloc");
        this.offsetSize = 8;
        this.lengthSize = 8;
        this.baseOffsetSize = 8;
        this.indexSize = 0;
        this.items = new LinkedList<Item>();
    }
    
    private static void ajc$preClinit() {
        final b b = new b("ItemLocationBox.java", (Class)ItemLocationBox.class);
        ajc$tjp_0 = (a)b.f(b.e("getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 119);
        ajc$tjp_1 = (a)b.f(b.e("setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", "", "void"), 123);
        ajc$tjp_10 = (a)b.f(b.e("createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", "", "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = (a)b.f(b.e("createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", "", "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = (a)b.f(b.e("getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 127);
        ajc$tjp_3 = (a)b.f(b.e("setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", "", "void"), 131);
        ajc$tjp_4 = (a)b.f(b.e("getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 135);
        ajc$tjp_5 = (a)b.f(b.e("setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", "", "void"), 139);
        ajc$tjp_6 = (a)b.f(b.e("getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "int"), 143);
        ajc$tjp_7 = (a)b.f(b.e("setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", "", "void"), 147);
        ajc$tjp_8 = (a)b.f(b.e("getItems", "com.coremedia.iso.boxes.ItemLocationBox", "", "", "", "java.util.List"), 151);
        ajc$tjp_9 = (a)b.f(b.e("setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", "", "void"), 155);
    }
    
    public void _parseDetails(final ByteBuffer byteBuffer) {
        this.parseVersionAndFlags(byteBuffer);
        int value;
        final byte b = (byte)(value = byteBuffer.get());
        if (b < 0) {
            value = b + 256;
        }
        this.offsetSize = value >>> 4;
        this.lengthSize = (value & 0xF);
        final byte value2 = byteBuffer.get();
        int n;
        if ((n = value2) < 0) {
            n = value2 + 256;
        }
        this.baseOffsetSize = n >>> 4;
        if (this.getVersion() == 1) {
            this.indexSize = (n & 0xF);
        }
        for (int s0 = xd.a.S0(byteBuffer), i = 0; i < s0; ++i) {
            this.items.add(new Item(byteBuffer));
        }
    }
    
    public Extent createExtent(final long n, final long n2, final long n3) {
        final a ajc$tjp_11 = ItemLocationBox.ajc$tjp_11;
        final Long n4 = new Long(n);
        final Long n5 = new Long(n2);
        final Long n6 = new Long(n3);
        final Hashtable c = b.c;
        final c c2 = new c(ajc$tjp_11, (Object)this, (Object)this, new Object[] { n4, n5, n6 });
        e.a().getClass();
        e.b(c2);
        return new Extent(n, n2, n3);
    }
    
    public Extent createExtent(final ByteBuffer byteBuffer) {
        return new Extent(byteBuffer);
    }
    
    public Item createItem(final int n, final int n2, final int n3, final long n4, final List<Extent> list) {
        final a ajc$tjp_10 = ItemLocationBox.ajc$tjp_10;
        final Integer n5 = new Integer(n);
        final Integer n6 = new Integer(n2);
        final Integer n7 = new Integer(n3);
        final Long n8 = new Long(n4);
        final Hashtable c = b.c;
        final c c2 = new c(ajc$tjp_10, (Object)this, (Object)this, new Object[] { n5, n6, n7, n8, list });
        e.a().getClass();
        e.b(c2);
        return new Item(n, n2, n3, n4, list);
    }
    
    public Item createItem(final ByteBuffer byteBuffer) {
        return new Item(byteBuffer);
    }
    
    public int getBaseOffsetSize() {
        m5.a.s(b.b(ItemLocationBox.ajc$tjp_4, (Object)this, (Object)this));
        return this.baseOffsetSize;
    }
    
    public void getContent(final ByteBuffer byteBuffer) {
        this.writeVersionAndFlags(byteBuffer);
        byteBuffer.put((byte)((this.offsetSize << 4 | this.lengthSize) & 0xFF));
        if (this.getVersion() == 1) {
            byteBuffer.put((byte)((this.baseOffsetSize << 4 | this.indexSize) & 0xFF));
        }
        else {
            byteBuffer.put((byte)(this.baseOffsetSize << 4 & 0xFF));
        }
        if0.a.m0(this.items.size(), byteBuffer);
        final Iterator<Item> iterator = this.items.iterator();
        while (iterator.hasNext()) {
            iterator.next().getContent(byteBuffer);
        }
    }
    
    public long getContentSize() {
        final Iterator<Item> iterator = this.items.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            n += iterator.next().getSize();
        }
        return n;
    }
    
    public int getIndexSize() {
        m5.a.s(b.b(ItemLocationBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.indexSize;
    }
    
    public List<Item> getItems() {
        m5.a.s(b.b(ItemLocationBox.ajc$tjp_8, (Object)this, (Object)this));
        return this.items;
    }
    
    public int getLengthSize() {
        m5.a.s(b.b(ItemLocationBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.lengthSize;
    }
    
    public int getOffsetSize() {
        m5.a.s(b.b(ItemLocationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.offsetSize;
    }
    
    public void setBaseOffsetSize(final int baseOffsetSize) {
        m5.a.s(b.c(ItemLocationBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(baseOffsetSize)));
        this.baseOffsetSize = baseOffsetSize;
    }
    
    public void setIndexSize(final int indexSize) {
        m5.a.s(b.c(ItemLocationBox.ajc$tjp_7, (Object)this, (Object)this, (Object)new Integer(indexSize)));
        this.indexSize = indexSize;
    }
    
    public void setItems(final List<Item> items) {
        m5.a.s(b.c(ItemLocationBox.ajc$tjp_9, (Object)this, (Object)this, (Object)items));
        this.items = items;
    }
    
    public void setLengthSize(final int lengthSize) {
        m5.a.s(b.c(ItemLocationBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(lengthSize)));
        this.lengthSize = lengthSize;
    }
    
    public void setOffsetSize(final int offsetSize) {
        m5.a.s(b.c(ItemLocationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(offsetSize)));
        this.offsetSize = offsetSize;
    }
    
    public class Extent
    {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;
        public final ItemLocationBox this$0;
        
        public Extent(final ItemLocationBox this$0, final long extentOffset, final long extentLength, final long extentIndex) {
            this.this$0 = this$0;
            this.extentOffset = extentOffset;
            this.extentLength = extentLength;
            this.extentIndex = extentIndex;
        }
        
        public Extent(final ItemLocationBox this$0, final ByteBuffer byteBuffer) {
            this.this$0 = this$0;
            if (this$0.getVersion() == 1) {
                final int indexSize = this$0.indexSize;
                if (indexSize > 0) {
                    this.extentIndex = ah0.b.h1(indexSize, byteBuffer);
                }
            }
            this.extentOffset = ah0.b.h1(this$0.offsetSize, byteBuffer);
            this.extentLength = ah0.b.h1(this$0.lengthSize, byteBuffer);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final Extent extent = (Extent)o;
                return this.extentIndex == extent.extentIndex && this.extentLength == extent.extentLength && this.extentOffset == extent.extentOffset;
            }
            return false;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            if (this.this$0.getVersion() == 1) {
                final int indexSize = this.this$0.indexSize;
                if (indexSize > 0) {
                    l0.t1(this.extentIndex, indexSize, byteBuffer);
                }
            }
            l0.t1(this.extentOffset, this.this$0.offsetSize, byteBuffer);
            l0.t1(this.extentLength, this.this$0.lengthSize, byteBuffer);
        }
        
        public int getSize() {
            final ItemLocationBox this$0 = this.this$0;
            int indexSize = this$0.indexSize;
            if (indexSize <= 0) {
                indexSize = 0;
            }
            return indexSize + this$0.offsetSize + this$0.lengthSize;
        }
        
        @Override
        public int hashCode() {
            final long extentOffset = this.extentOffset;
            final int n = (int)(extentOffset ^ extentOffset >>> 32);
            final long extentLength = this.extentLength;
            final int n2 = (int)(extentLength ^ extentLength >>> 32);
            final long extentIndex = this.extentIndex;
            return (n * 31 + n2) * 31 + (int)(extentIndex >>> 32 ^ extentIndex);
        }
        
        @Override
        public String toString() {
            final StringBuilder q = android.support.v4.media.a.q("Extent", "{extentOffset=");
            q.append(this.extentOffset);
            q.append(", extentLength=");
            q.append(this.extentLength);
            q.append(", extentIndex=");
            return k.k(q, this.extentIndex, '}');
        }
    }
    
    public class Item
    {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List<Extent> extents;
        public int itemId;
        public final ItemLocationBox this$0;
        
        public Item(final ItemLocationBox this$0, final int itemId, final int constructionMethod, final int dataReferenceIndex, final long baseOffset, final List<Extent> extents) {
            this.this$0 = this$0;
            new LinkedList();
            this.itemId = itemId;
            this.constructionMethod = constructionMethod;
            this.dataReferenceIndex = dataReferenceIndex;
            this.baseOffset = baseOffset;
            this.extents = extents;
        }
        
        public Item(final ItemLocationBox this$0, final ByteBuffer byteBuffer) {
            this.this$0 = this$0;
            this.extents = new LinkedList<Extent>();
            this.itemId = xd.a.S0(byteBuffer);
            if (this$0.getVersion() == 1) {
                this.constructionMethod = (xd.a.S0(byteBuffer) & 0xF);
            }
            this.dataReferenceIndex = xd.a.S0(byteBuffer);
            final int baseOffsetSize = this$0.baseOffsetSize;
            if (baseOffsetSize > 0) {
                this.baseOffset = ah0.b.h1(baseOffsetSize, byteBuffer);
            }
            else {
                this.baseOffset = 0L;
            }
            for (int s0 = xd.a.S0(byteBuffer), i = 0; i < s0; ++i) {
                this.extents.add(this$0.new Extent(byteBuffer));
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final Item item = (Item)o;
            if (this.baseOffset != item.baseOffset) {
                return false;
            }
            if (this.constructionMethod != item.constructionMethod) {
                return false;
            }
            if (this.dataReferenceIndex != item.dataReferenceIndex) {
                return false;
            }
            if (this.itemId != item.itemId) {
                return false;
            }
            final List<Extent> extents = this.extents;
            final List<Extent> extents2 = item.extents;
            if (extents != null) {
                if (extents.equals(extents2)) {
                    return true;
                }
            }
            else if (extents2 == null) {
                return true;
            }
            return false;
        }
        
        public void getContent(final ByteBuffer byteBuffer) {
            if0.a.m0(this.itemId, byteBuffer);
            if (this.this$0.getVersion() == 1) {
                if0.a.m0(this.constructionMethod, byteBuffer);
            }
            if0.a.m0(this.dataReferenceIndex, byteBuffer);
            final int baseOffsetSize = this.this$0.baseOffsetSize;
            if (baseOffsetSize > 0) {
                l0.t1(this.baseOffset, baseOffsetSize, byteBuffer);
            }
            if0.a.m0(this.extents.size(), byteBuffer);
            final Iterator<Extent> iterator = this.extents.iterator();
            while (iterator.hasNext()) {
                iterator.next().getContent(byteBuffer);
            }
        }
        
        public int getSize() {
            int n;
            if (this.this$0.getVersion() == 1) {
                n = 4;
            }
            else {
                n = 2;
            }
            int n2 = n + 2 + this.this$0.baseOffsetSize + 2;
            final Iterator<Extent> iterator = this.extents.iterator();
            while (iterator.hasNext()) {
                n2 += iterator.next().getSize();
            }
            return n2;
        }
        
        @Override
        public int hashCode() {
            final int itemId = this.itemId;
            final int constructionMethod = this.constructionMethod;
            final int dataReferenceIndex = this.dataReferenceIndex;
            final long baseOffset = this.baseOffset;
            final int n = (int)(baseOffset ^ baseOffset >>> 32);
            final List<Extent> extents = this.extents;
            int hashCode;
            if (extents != null) {
                hashCode = extents.hashCode();
            }
            else {
                hashCode = 0;
            }
            return (((itemId * 31 + constructionMethod) * 31 + dataReferenceIndex) * 31 + n) * 31 + hashCode;
        }
        
        public void setBaseOffset(final long baseOffset) {
            this.baseOffset = baseOffset;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Item{baseOffset=");
            sb.append(this.baseOffset);
            sb.append(", itemId=");
            sb.append(this.itemId);
            sb.append(", constructionMethod=");
            sb.append(this.constructionMethod);
            sb.append(", dataReferenceIndex=");
            sb.append(this.dataReferenceIndex);
            sb.append(", extents=");
            return h.d(sb, (List)this.extents, '}');
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.coremedia.iso.boxes;

import java.util.Iterator;
import ak0.n;
import java.util.Hashtable;
import com.googlecode.mp4parser.e;
import yt2.c;
import mj2.c0;
import java.nio.ByteBuffer;
import yt2.b;
import java.util.LinkedList;
import java.util.List;
import xt2.a;
import com.googlecode.mp4parser.AbstractFullBox;

public class ItemLocationBox extends AbstractFullBox
{
    public static final String TYPE = "iloc";
    private static final /* synthetic */ a ajc$tjp_0;
    private static final /* synthetic */ a ajc$tjp_1;
    private static final /* synthetic */ a ajc$tjp_10;
    private static final /* synthetic */ a ajc$tjp_11;
    private static final /* synthetic */ a ajc$tjp_2;
    private static final /* synthetic */ a ajc$tjp_3;
    private static final /* synthetic */ a ajc$tjp_4;
    private static final /* synthetic */ a ajc$tjp_5;
    private static final /* synthetic */ a ajc$tjp_6;
    private static final /* synthetic */ a ajc$tjp_7;
    private static final /* synthetic */ a ajc$tjp_8;
    private static final /* synthetic */ a ajc$tjp_9;
    public int baseOffsetSize;
    public int indexSize;
    public List<ItemLocationBox.ItemLocationBox$Item> items;
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
        this.items = new LinkedList<ItemLocationBox.ItemLocationBox$Item>();
    }
    
    private static /* synthetic */ void ajc$preClinit() {
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
        for (int y = c0.Y(byteBuffer), i = 0; i < y; ++i) {
            this.items.add(new ItemLocationBox.ItemLocationBox$Item(this, byteBuffer));
        }
    }
    
    public ItemLocationBox.ItemLocationBox$Extent createExtent(final long n, final long n2, final long n3) {
        final a ajc$tjp_11 = ItemLocationBox.ajc$tjp_11;
        final Long n4 = new Long(n);
        final Long n5 = new Long(n2);
        final Long n6 = new Long(n3);
        final Hashtable c = b.c;
        final c c2 = new c(ajc$tjp_11, (Object)this, (Object)this, new Object[] { n4, n5, n6 });
        e.a().getClass();
        e.b(c2);
        return new ItemLocationBox.ItemLocationBox$Extent(this, n, n2, n3);
    }
    
    public ItemLocationBox.ItemLocationBox$Extent createExtent(final ByteBuffer byteBuffer) {
        return new ItemLocationBox.ItemLocationBox$Extent(this, byteBuffer);
    }
    
    public ItemLocationBox.ItemLocationBox$Item createItem(final int n, final int n2, final int n3, final long n4, final List<ItemLocationBox.ItemLocationBox$Extent> list) {
        final a ajc$tjp_10 = ItemLocationBox.ajc$tjp_10;
        final Integer n5 = new Integer(n);
        final Integer n6 = new Integer(n2);
        final Integer n7 = new Integer(n3);
        final Long n8 = new Long(n4);
        final Hashtable c = b.c;
        final c c2 = new c(ajc$tjp_10, (Object)this, (Object)this, new Object[] { n5, n6, n7, n8, list });
        e.a().getClass();
        e.b(c2);
        return new ItemLocationBox.ItemLocationBox$Item(this, n, n2, n3, n4, (List)list);
    }
    
    public ItemLocationBox.ItemLocationBox$Item createItem(final ByteBuffer byteBuffer) {
        return new ItemLocationBox.ItemLocationBox$Item(this, byteBuffer);
    }
    
    public int getBaseOffsetSize() {
        n.x(b.b(ItemLocationBox.ajc$tjp_4, (Object)this, (Object)this));
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
        ah.a.m0(this.items.size(), byteBuffer);
        final Iterator<ItemLocationBox.ItemLocationBox$Item> iterator = this.items.iterator();
        while (iterator.hasNext()) {
            iterator.next().getContent(byteBuffer);
        }
    }
    
    public long getContentSize() {
        final Iterator<ItemLocationBox.ItemLocationBox$Item> iterator = this.items.iterator();
        long n = 8L;
        while (iterator.hasNext()) {
            n += iterator.next().getSize();
        }
        return n;
    }
    
    public int getIndexSize() {
        n.x(b.b(ItemLocationBox.ajc$tjp_6, (Object)this, (Object)this));
        return this.indexSize;
    }
    
    public List<ItemLocationBox.ItemLocationBox$Item> getItems() {
        n.x(b.b(ItemLocationBox.ajc$tjp_8, (Object)this, (Object)this));
        return this.items;
    }
    
    public int getLengthSize() {
        n.x(b.b(ItemLocationBox.ajc$tjp_2, (Object)this, (Object)this));
        return this.lengthSize;
    }
    
    public int getOffsetSize() {
        n.x(b.b(ItemLocationBox.ajc$tjp_0, (Object)this, (Object)this));
        return this.offsetSize;
    }
    
    public void setBaseOffsetSize(final int baseOffsetSize) {
        n.x(b.c(ItemLocationBox.ajc$tjp_5, (Object)this, (Object)this, (Object)new Integer(baseOffsetSize)));
        this.baseOffsetSize = baseOffsetSize;
    }
    
    public void setIndexSize(final int indexSize) {
        n.x(b.c(ItemLocationBox.ajc$tjp_7, (Object)this, (Object)this, (Object)new Integer(indexSize)));
        this.indexSize = indexSize;
    }
    
    public void setItems(final List<ItemLocationBox.ItemLocationBox$Item> items) {
        n.x(b.c(ItemLocationBox.ajc$tjp_9, (Object)this, (Object)this, (Object)items));
        this.items = items;
    }
    
    public void setLengthSize(final int lengthSize) {
        n.x(b.c(ItemLocationBox.ajc$tjp_3, (Object)this, (Object)this, (Object)new Integer(lengthSize)));
        this.lengthSize = lengthSize;
    }
    
    public void setOffsetSize(final int offsetSize) {
        n.x(b.c(ItemLocationBox.ajc$tjp_1, (Object)this, (Object)this, (Object)new Integer(offsetSize)));
        this.offsetSize = offsetSize;
    }
}

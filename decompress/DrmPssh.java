// 
// Decompiled by Procyon v0.6.0
// 

package com.amazonaws.ivs.player;

import java.util.Arrays;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
import java.util.List;

class DrmPssh
{
    private static final int PSSH;
    private byte[] data;
    private List<byte[]> keyIds;
    private UUID systemId;
    
    static {
        PSSH = Charset.forName("UTF-8").encode("pssh").getInt();
    }
    
    public DrmPssh(ByteBuffer order) {
        this.keyIds = new ArrayList<byte[]>();
        this.data = new byte[0];
        order = order.duplicate().order(ByteOrder.BIG_ENDIAN);
        final byte[] array = new byte[16];
        if (order.remaining() >= 28) {
            final int int1 = order.getInt();
            if (order.getInt() == DrmPssh.PSSH && order.remaining() >= int1 - 8) {
                final int int2 = order.getInt();
                order.get(array);
                this.systemId = getUUID(ByteBuffer.wrap(array));
                if (int2 >> 24 > 0) {
                    for (int int3 = order.getInt(), i = 0; i < int3; ++i) {
                        final byte[] array2 = new byte[16];
                        order.get(array2);
                        this.keyIds.add(array2);
                    }
                }
                final int int4 = order.getInt();
                if (int4 > 0) {
                    final byte[] data = new byte[int4];
                    order.get(this.data = data, 0, data.length);
                }
            }
        }
    }
    
    private static UUID getUUID(final ByteBuffer byteBuffer) {
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof DrmPssh;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final DrmPssh drmPssh = (DrmPssh)o;
            final UUID systemId = this.systemId;
            b3 = b2;
            if (systemId != null) {
                b3 = b2;
                if (systemId.equals(drmPssh.systemId)) {
                    b3 = b2;
                    if (this.keyIds.equals(drmPssh.keyIds)) {
                        b3 = b2;
                        if (Arrays.equals(this.data, drmPssh.data)) {
                            b3 = true;
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    public byte[] getData() {
        return this.data;
    }
    
    public List<byte[]> getKeyIds() {
        return this.keyIds;
    }
    
    public UUID getSystemId() {
        return this.systemId;
    }
    
    @Override
    public int hashCode() {
        final byte[] data = this.data;
        if (data.length > 0) {
            return Arrays.hashCode(data);
        }
        return this.keyIds.hashCode();
    }
}

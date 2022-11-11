// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/data/room/model/DiscoveryUnitType;", "", "id", "", "(Ljava/lang/String;II)V", "getId", "()I", "TYPE_TOPICS", "roomdb_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum DiscoveryUnitType
{
    TYPE_TOPICS(0);
    
    private final int id;
    
    private DiscoveryUnitType(final int id) {
        this.id = id;
    }
    
    public final int getId() {
        return this.id;
    }
}

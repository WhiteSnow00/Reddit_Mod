// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v1;

import kotlin.collections.EmptyList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n" }, d2 = { "Lcom/reddit/data/model/v1/EmptyListChildren;", "T", "Lcom/reddit/data/model/v1/ListChildren;", "()V", "getAfter", "", "getChildren", "", "getPagination", "Lcom/reddit/data/model/v1/ListChildren$Pagination;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EmptyListChildren<T> extends ListChildren<T>
{
    @Override
    public String getAfter() {
        return null;
    }
    
    @Override
    public List<T> getChildren() {
        return (List<T>)EmptyList.INSTANCE;
    }
    
    @Override
    public Pagination getPagination() {
        return null;
    }
}

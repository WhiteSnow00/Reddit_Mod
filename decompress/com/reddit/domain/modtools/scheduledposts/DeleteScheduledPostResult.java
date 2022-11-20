// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts;

import p1.h;
import kotlin.collections.EmptyList;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/DeleteScheduledPostResult;", "", "errors", "", "", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class DeleteScheduledPostResult
{
    private final List<String> errors;
    
    public DeleteScheduledPostResult() {
        this(null, 1, null);
    }
    
    public DeleteScheduledPostResult(final List<String> errors) {
        e.f((Object)errors, "errors");
        this.errors = errors;
    }
    
    public DeleteScheduledPostResult(List instance, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        this((List<String>)instance);
    }
    
    public static DeleteScheduledPostResult copy$default(final DeleteScheduledPostResult deleteScheduledPostResult, List errors, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            errors = deleteScheduledPostResult.errors;
        }
        return deleteScheduledPostResult.copy(errors);
    }
    
    public final List<String> component1() {
        return this.errors;
    }
    
    public final DeleteScheduledPostResult copy(final List<String> list) {
        e.f((Object)list, "errors");
        return new DeleteScheduledPostResult(list);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof DeleteScheduledPostResult && e.a((Object)this.errors, (Object)((DeleteScheduledPostResult)o).errors));
    }
    
    public final List<String> getErrors() {
        return this.errors;
    }
    
    @Override
    public int hashCode() {
        return this.errors.hashCode();
    }
    
    @Override
    public String toString() {
        return h.d(a.t("DeleteScheduledPostResult(errors="), (List)this.errors, ')');
    }
}

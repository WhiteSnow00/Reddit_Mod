// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.viewpager.widget.c;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/UseCaseResult;", "", "()V", "Failure", "Success", "Lcom/reddit/domain/model/UseCaseResult$Failure;", "Lcom/reddit/domain/model/UseCaseResult$Success;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class UseCaseResult
{
    private UseCaseResult() {
    }
    
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/UseCaseResult$Failure;", "Lcom/reddit/domain/model/UseCaseResult;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Failure extends UseCaseResult
    {
        private final Throwable e;
        
        public Failure(final Throwable e) {
            f.f((Object)e, "e");
            super(null);
            this.e = e;
        }
        
        public final Throwable component1() {
            return this.e;
        }
        
        public final Failure copy(final Throwable t) {
            f.f((Object)t, "e");
            return new Failure(t);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Failure && f.a((Object)this.e, (Object)((Failure)o).e));
        }
        
        public final Throwable getE() {
            return this.e;
        }
        
        @Override
        public int hashCode() {
            return this.e.hashCode();
        }
        
        @Override
        public String toString() {
            return c.l(a.k("Failure(e="), this.e, ')');
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/model/UseCaseResult$Success;", "Lcom/reddit/domain/model/UseCaseResult;", "()V", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Success extends UseCaseResult
    {
        public static final Success INSTANCE;
        
        static {
            INSTANCE = new Success();
        }
        
        private Success() {
            super(null);
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u000e\b\u0001\u0010\u0002 \u0001*\u00060\u0003j\u0002`\u00042\u00020\u0005:\u0002\u0011\u0012B\u0007\b\u0004¢\u0006\u0002\u0010\u0006J\r\u0010\u0010\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fR\u0014\u0010\u0007\u001a\u0004\u0018\u00018\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00018\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/ResultOrException;", "T", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "()V", "error", "getError", "()Ljava/lang/Exception;", "isSuccess", "", "()Z", "result", "getResult", "()Ljava/lang/Object;", "tryUnwrap", "Error", "Success", "Lcom/reddit/domain/model/ResultOrException$Error;", "Lcom/reddit/domain/model/ResultOrException$Success;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ResultOrException<T, E extends Exception>
{
    private ResultOrException() {
    }
    
    public ResultOrException(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    public abstract E getError();
    
    public abstract T getResult();
    
    public final boolean isSuccess() {
        return this.getError() == null;
    }
    
    public abstract T tryUnwrap();
    
    @Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u000e\b\u0002\u0010\u0001 \u0001*\u00060\u0002j\u0002`\u00032\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00010\u0004B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00028\u0002H\u00c6\u0003¢\u0006\u0002\u0010\tJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0002H\u00c6\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u0016\u0010\u0006\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a" }, d2 = { "Lcom/reddit/domain/model/ResultOrException$Error;", "E", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/reddit/domain/model/ResultOrException;", "", "error", "(Ljava/lang/Exception;)V", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "result", "getResult", "()Ljava/lang/Void;", "component1", "copy", "(Ljava/lang/Exception;)Lcom/reddit/domain/model/ResultOrException$Error;", "equals", "", "other", "", "hashCode", "", "toString", "", "tryUnwrap", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Error<E extends Exception> extends ResultOrException
    {
        private final E error;
        private final Void result;
        
        public Error(final E error) {
            e.f((Object)error, "error");
            super(null);
            this.error = error;
        }
        
        public static Error copy$default(final Error error, Exception error2, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                error2 = error.getError();
            }
            return error.copy(error2);
        }
        
        public final E component1() {
            return this.getError();
        }
        
        public final Error<E> copy(final E e) {
            e.f((Object)e, "error");
            return new Error<E>(e);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Error && e.a(this.getError(), ((Error)o).getError()));
        }
        
        @Override
        public E getError() {
            return this.error;
        }
        
        @Override
        public /* bridge */ Object getResult() {
            return this.getResult();
        }
        
        @Override
        public Void getResult() {
            return this.result;
        }
        
        @Override
        public int hashCode() {
            return this.getError().hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("Error(error=");
            t.append(this.getError());
            t.append(')');
            return t.toString();
        }
        
        @Override
        public /* bridge */ Object tryUnwrap() {
            return this.tryUnwrap();
        }
        
        @Override
        public Void tryUnwrap() {
            throw this.getError();
        }
    }
    
    @Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00028\u0002H\u00c6\u0003¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0002H\u00c6\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\r\u0010\u0017\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/ResultOrException$Success;", "T", "Lcom/reddit/domain/model/ResultOrException;", "", "result", "(Ljava/lang/Object;)V", "error", "getError", "()Ljava/lang/Void;", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/reddit/domain/model/ResultOrException$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "tryUnwrap", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Success<T> extends ResultOrException
    {
        private final Void error;
        private final T result;
        
        public Success(final T result) {
            super(null);
            this.result = result;
        }
        
        public static Success copy$default(final Success success, Object result, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                result = success.getResult();
            }
            return success.copy(result);
        }
        
        public final T component1() {
            return this.getResult();
        }
        
        public final Success<T> copy(final T t) {
            return new Success<T>(t);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Success && e.a(this.getResult(), ((Success)o).getResult()));
        }
        
        @Override
        public /* bridge */ Exception getError() {
            return (Exception)this.getError();
        }
        
        public Void getError() {
            return this.error;
        }
        
        @Override
        public T getResult() {
            return this.result;
        }
        
        @Override
        public int hashCode() {
            int hashCode;
            if (this.getResult() == null) {
                hashCode = 0;
            }
            else {
                hashCode = this.getResult().hashCode();
            }
            return hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder t = a.t("Success(result=");
            t.append(this.getResult());
            t.append(')');
            return t.toString();
        }
        
        @Override
        public T tryUnwrap() {
            return this.getResult();
        }
    }
}

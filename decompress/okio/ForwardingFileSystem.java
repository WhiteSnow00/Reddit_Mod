// 
// Decompiled by Procyon v0.6.0
// 

package okio;

import fk2.g0;
import fk2.h;
import ug2.d;
import java.util.Map;
import fk2.i;
import mg2.l;
import kotlin.sequences.b;
import wi2.k;
import java.util.Iterator;
import dg2.n;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import fk2.e0;
import fk2.y;
import ng2.e;
import fk2.j;

public abstract class ForwardingFileSystem extends j
{
    private final j delegate;
    
    public ForwardingFileSystem(final j delegate) {
        e.f((Object)delegate, "delegate");
        this.delegate = delegate;
    }
    
    @Override
    public e0 appendingSink(y onPathParameter, final boolean b) throws IOException {
        e.f((Object)onPathParameter, "file");
        onPathParameter = this.onPathParameter(onPathParameter, "appendingSink", "file");
        return this.delegate.appendingSink(onPathParameter, b);
    }
    
    @Override
    public void atomicMove(y onPathParameter, y onPathParameter2) throws IOException {
        e.f((Object)onPathParameter, "source");
        e.f((Object)onPathParameter2, "target");
        onPathParameter = this.onPathParameter(onPathParameter, "atomicMove", "source");
        onPathParameter2 = this.onPathParameter(onPathParameter2, "atomicMove", "target");
        this.delegate.atomicMove(onPathParameter, onPathParameter2);
    }
    
    @Override
    public y canonicalize(y onPathParameter) throws IOException {
        e.f((Object)onPathParameter, "path");
        onPathParameter = this.onPathParameter(onPathParameter, "canonicalize", "path");
        return this.onPathResult(this.delegate.canonicalize(onPathParameter), "canonicalize");
    }
    
    @Override
    public void createDirectory(y onPathParameter, final boolean b) throws IOException {
        e.f((Object)onPathParameter, "dir");
        onPathParameter = this.onPathParameter(onPathParameter, "createDirectory", "dir");
        this.delegate.createDirectory(onPathParameter, b);
    }
    
    @Override
    public void createSymlink(y onPathParameter, y onPathParameter2) throws IOException {
        e.f((Object)onPathParameter, "source");
        e.f((Object)onPathParameter2, "target");
        onPathParameter = this.onPathParameter(onPathParameter, "createSymlink", "source");
        onPathParameter2 = this.onPathParameter(onPathParameter2, "createSymlink", "target");
        this.delegate.createSymlink(onPathParameter, onPathParameter2);
    }
    
    public final j delegate() {
        return this.delegate;
    }
    
    @Override
    public void delete(y onPathParameter, final boolean b) throws IOException {
        e.f((Object)onPathParameter, "path");
        onPathParameter = this.onPathParameter(onPathParameter, "delete", "path");
        this.delegate.delete(onPathParameter, b);
    }
    
    @Override
    public List<y> list(y onPathParameter) throws IOException {
        e.f((Object)onPathParameter, "dir");
        onPathParameter = this.onPathParameter(onPathParameter, "list", "dir");
        final List<y> list = this.delegate.list(onPathParameter);
        final ArrayList list2 = new ArrayList();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(this.onPathResult(iterator.next(), "list"));
        }
        n.w4((List<Comparable>)list2);
        return list2;
    }
    
    @Override
    public List<y> listOrNull(y onPathParameter) {
        e.f((Object)onPathParameter, "dir");
        onPathParameter = this.onPathParameter(onPathParameter, "listOrNull", "dir");
        final List<y> listOrNull = this.delegate.listOrNull(onPathParameter);
        if (listOrNull == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        final Iterator<Object> iterator = listOrNull.iterator();
        while (iterator.hasNext()) {
            list.add(this.onPathResult(iterator.next(), "listOrNull"));
        }
        n.w4((List<Comparable>)list);
        return list;
    }
    
    @Override
    public k<y> listRecursively(y onPathParameter, final boolean b) {
        e.f((Object)onPathParameter, "dir");
        onPathParameter = this.onPathParameter(onPathParameter, "listRecursively", "dir");
        return (k<y>)b.T1((k)this.delegate.listRecursively(onPathParameter, b), (l)new ForwardingFileSystem$listRecursively$1(this));
    }
    
    @Override
    public i metadataOrNull(y y) throws IOException {
        e.f((Object)y, "path");
        y = this.onPathParameter(y, "metadataOrNull", "path");
        final i metadataOrNull = this.delegate.metadataOrNull(y);
        if (metadataOrNull == null) {
            return null;
        }
        y = metadataOrNull.c;
        if (y == null) {
            return metadataOrNull;
        }
        final y onPathResult = this.onPathResult(y, "metadataOrNull");
        final boolean a = metadataOrNull.a;
        final boolean b = metadataOrNull.b;
        final Long d = metadataOrNull.d;
        final Long e = metadataOrNull.e;
        final Long f = metadataOrNull.f;
        final Long g = metadataOrNull.g;
        final Map<d<?>, Object> h = metadataOrNull.h;
        ng2.e.f((Object)h, "extras");
        return new i(a, b, onPathResult, d, e, f, g, h);
    }
    
    public y onPathParameter(final y y, final String s, final String s2) {
        e.f((Object)y, "path");
        e.f((Object)s, "functionName");
        e.f((Object)s2, "parameterName");
        return y;
    }
    
    public y onPathResult(final y y, final String s) {
        e.f((Object)y, "path");
        e.f((Object)s, "functionName");
        return y;
    }
    
    @Override
    public h openReadOnly(y onPathParameter) throws IOException {
        e.f((Object)onPathParameter, "file");
        onPathParameter = this.onPathParameter(onPathParameter, "openReadOnly", "file");
        return this.delegate.openReadOnly(onPathParameter);
    }
    
    @Override
    public h openReadWrite(y onPathParameter, final boolean b, final boolean b2) throws IOException {
        e.f((Object)onPathParameter, "file");
        onPathParameter = this.onPathParameter(onPathParameter, "openReadWrite", "file");
        return this.delegate.openReadWrite(onPathParameter, b, b2);
    }
    
    @Override
    public e0 sink(y onPathParameter, final boolean b) throws IOException {
        e.f((Object)onPathParameter, "file");
        onPathParameter = this.onPathParameter(onPathParameter, "sink", "file");
        return this.delegate.sink(onPathParameter, b);
    }
    
    @Override
    public g0 source(y onPathParameter) throws IOException {
        e.f((Object)onPathParameter, "file");
        onPathParameter = this.onPathParameter(onPathParameter, "source", "file");
        return this.delegate.source(onPathParameter);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)ng2.h.a((Class)this.getClass()).n());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }
}

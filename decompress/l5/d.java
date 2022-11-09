// 
// Decompiled by Procyon v0.6.0
// 

package l5;

import androidx.room.Index$Order;
import ak0.m;
import java.util.Locale;
import ak0.n;
import java.util.Collection;
import java.util.TreeMap;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import o5.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public final class d
{
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;
    
    public d(final String a, final HashMap hashMap, final HashSet set, final HashSet set2) {
        this.a = a;
        this.b = Collections.unmodifiableMap((Map<? extends String, ? extends a>)hashMap);
        this.c = Collections.unmodifiableSet((Set<? extends b>)set);
        Set<d> unmodifiableSet;
        if (set2 == null) {
            unmodifiableSet = null;
        }
        else {
            unmodifiableSet = Collections.unmodifiableSet((Set<? extends d>)set2);
        }
        this.d = unmodifiableSet;
    }
    
    public static d a(final o5.a a, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(s);
        sb.append("`)");
        Object o = a.V1(sb.toString());
        final HashMap hashMap = new HashMap();
        try {
            if (((Cursor)o).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)o).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)o).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)o).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)o).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)o).getColumnIndex("dflt_value");
                while (((Cursor)o).moveToNext()) {
                    final String string = ((Cursor)o).getString(columnIndex);
                    hashMap.put(string, new a(((Cursor)o).getInt(columnIndex4), string, ((Cursor)o).getString(columnIndex2), ((Cursor)o).getString(columnIndex5), ((Cursor)o).getInt(columnIndex3) != 0, 2));
                }
            }
            ((Cursor)o).close();
            final HashSet<b> set = new HashSet<b>();
            o = new StringBuilder();
            ((StringBuilder)o).append("PRAGMA foreign_key_list(`");
            ((StringBuilder)o).append(s);
            ((StringBuilder)o).append("`)");
            Object v1 = a.V1(((StringBuilder)o).toString());
            try {
                final int columnIndex6 = ((Cursor)v1).getColumnIndex("id");
                final int columnIndex7 = ((Cursor)v1).getColumnIndex("seq");
                final int columnIndex8 = ((Cursor)v1).getColumnIndex("table");
                final int columnIndex9 = ((Cursor)v1).getColumnIndex("on_delete");
                final int columnIndex10 = ((Cursor)v1).getColumnIndex("on_update");
                o = b((Cursor)v1);
                for (int count = ((Cursor)v1).getCount(), i = 0; i < count; ++i) {
                    ((Cursor)v1).moveToPosition(i);
                    if (((Cursor)v1).getInt(columnIndex7) == 0) {
                        final int int1 = ((Cursor)v1).getInt(columnIndex6);
                        final ArrayList<String> list = new ArrayList<String>();
                        final ArrayList<String> list2 = new ArrayList<String>();
                        for (final c c : o) {
                            if (c.f == int1) {
                                list.add(c.h);
                                list2.add(c.i);
                            }
                        }
                        set.add(new b(((Cursor)v1).getString(columnIndex8), list, list2, ((Cursor)v1).getString(columnIndex9), ((Cursor)v1).getString(columnIndex10)));
                    }
                }
                ((Cursor)v1).close();
                o = new StringBuilder();
                ((StringBuilder)o).append("PRAGMA index_list(`");
                ((StringBuilder)o).append(s);
                ((StringBuilder)o).append("`)");
                final Cursor v2 = a.V1(((StringBuilder)o).toString());
                try {
                    final int columnIndex11 = v2.getColumnIndex("name");
                    final int columnIndex12 = v2.getColumnIndex("origin");
                    final int columnIndex13 = v2.getColumnIndex("unique");
                    o = null;
                    Label_0733: {
                        if (columnIndex11 != -1 && columnIndex12 != -1) {
                            if (columnIndex13 != -1) {
                                v1 = new HashSet<d>();
                                while (v2.moveToNext()) {
                                    if (!"c".equals(v2.getString(columnIndex12))) {
                                        continue;
                                    }
                                    final d c2 = c(a, v2.getString(columnIndex11), v2.getInt(columnIndex13) == 1);
                                    if (c2 == null) {
                                        break Label_0733;
                                    }
                                    ((HashSet<d>)v1).add(c2);
                                }
                                v2.close();
                                final Serializable s2 = (Serializable)v1;
                                return new d(s, hashMap, set, (HashSet)s2);
                            }
                        }
                    }
                    v2.close();
                    final Serializable s2 = (Serializable)o;
                    return new d(s, hashMap, set, (HashSet)s2);
                }
                finally {
                    v2.close();
                }
            }
            finally {
                ((Cursor)v1).close();
            }
        }
        finally {
            ((Cursor)o).close();
        }
    }
    
    public static ArrayList b(final Cursor cursor) {
        final int columnIndex = cursor.getColumnIndex("id");
        final int columnIndex2 = cursor.getColumnIndex("seq");
        final int columnIndex3 = cursor.getColumnIndex("from");
        final int columnIndex4 = cursor.getColumnIndex("to");
        final int count = cursor.getCount();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < count; ++i) {
            cursor.moveToPosition(i);
            list.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    public static d c(final o5.a a, final String s, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_xinfo(`");
        sb.append(s);
        sb.append("`)");
        final Cursor v1 = a.V1(sb.toString());
        try {
            final int columnIndex = v1.getColumnIndex("seqno");
            final int columnIndex2 = v1.getColumnIndex("cid");
            final int columnIndex3 = v1.getColumnIndex("name");
            final int columnIndex4 = v1.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                final TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
                final TreeMap treeMap2 = new TreeMap();
                while (v1.moveToNext()) {
                    if (v1.getInt(columnIndex2) < 0) {
                        continue;
                    }
                    final int int1 = v1.getInt(columnIndex);
                    final String string = v1.getString(columnIndex3);
                    String s2;
                    if (v1.getInt(columnIndex4) > 0) {
                        s2 = "DESC";
                    }
                    else {
                        s2 = "ASC";
                    }
                    treeMap.put(int1, string);
                    treeMap2.put(int1, s2);
                }
                final ArrayList list = new ArrayList(treeMap.size());
                list.addAll((Collection)treeMap.values());
                final ArrayList list2 = new ArrayList(treeMap2.size());
                list2.addAll(treeMap2.values());
                return new d(s, list, list2, b);
            }
            return null;
        }
        finally {
            v1.close();
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        final String a = this.a;
        Label_0053: {
            if (a != null) {
                if (a.equals(d.a)) {
                    break Label_0053;
                }
            }
            else if (d.a == null) {
                break Label_0053;
            }
            return false;
        }
        final Map<String, a> b = this.b;
        Label_0087: {
            if (b != null) {
                if (b.equals(d.b)) {
                    break Label_0087;
                }
            }
            else if (d.b == null) {
                break Label_0087;
            }
            return false;
        }
        final Set<b> c = this.c;
        Label_0121: {
            if (c != null) {
                if (c.equals(d.c)) {
                    break Label_0121;
                }
            }
            else if (d.c == null) {
                break Label_0121;
            }
            return false;
        }
        final Set<d> d2 = this.d;
        if (d2 != null) {
            final Set<d> d3 = d.d;
            if (d3 != null) {
                return d2.equals(d3);
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Map<String, a> b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set<b> c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TableInfo{name='");
        n.w(k, this.a, '\'', ", columns=");
        k.append(this.b);
        k.append(", foreignKeys=");
        k.append(this.c);
        k.append(", indices=");
        k.append(this.d);
        k.append('}');
        return k.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;
        
        public a(int n, String upperCase, final String b, final String f, final boolean d, final int g) {
            this.a = upperCase;
            this.b = b;
            this.d = d;
            this.e = n;
            n = 5;
            if (b != null) {
                upperCase = b.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    n = 3;
                }
                else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                            n = 1;
                        }
                        else {
                            n = 4;
                        }
                    }
                }
                else {
                    n = 2;
                }
            }
            this.c = n;
            this.f = f;
            this.g = g;
        }
        
        public static boolean a(final String s, final String s2) {
            if (s2 == null) {
                return false;
            }
            if (s.equals(s2)) {
                return true;
            }
            Label_0129: {
                if (s.length() != 0) {
                    int n;
                    int n2;
                    for (int i = n = 0; i < s.length(); ++i, n = n2) {
                        final char char1 = s.charAt(i);
                        if (i == 0 && char1 != '(') {
                            break Label_0129;
                        }
                        if (char1 == '(') {
                            n2 = n + 1;
                        }
                        else {
                            n2 = n;
                            if (char1 == ')') {
                                n2 = --n;
                                if (n == 0) {
                                    n2 = n;
                                    if (i != s.length() - 1) {
                                        break Label_0129;
                                    }
                                }
                            }
                        }
                    }
                    if (n == 0) {
                        final boolean b = true;
                        return b && s.substring(1, s.length() - 1).trim().equals(s2);
                    }
                }
            }
            final boolean b = false;
            return b && s.substring(1, s.length() - 1).trim().equals(s2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            if (this.e != a.e) {
                return false;
            }
            if (!this.a.equals(a.a)) {
                return false;
            }
            if (this.d != a.d) {
                return false;
            }
            if (this.g == 1 && a.g == 2) {
                final String f = this.f;
                if (f != null && !a(f, a.f)) {
                    return false;
                }
            }
            if (this.g == 2 && a.g == 1) {
                final String f2 = a.f;
                if (f2 != null && !a(f2, this.f)) {
                    return false;
                }
            }
            final int g = this.g;
            Label_0193: {
                if (g != 0 && g == a.g) {
                    final String f3 = this.f;
                    if (f3 != null) {
                        if (a(f3, a.f)) {
                            break Label_0193;
                        }
                    }
                    else if (a.f == null) {
                        break Label_0193;
                    }
                    return false;
                }
            }
            if (this.c != a.c) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int c = this.c;
            int n;
            if (this.d) {
                n = 1231;
            }
            else {
                n = 1237;
            }
            return ((hashCode * 31 + c) * 31 + n) * 31 + this.e;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("Column{name='");
            n.w(k, this.a, '\'', ", type='");
            n.w(k, this.b, '\'', ", affinity='");
            k.append(this.c);
            k.append('\'');
            k.append(", notNull=");
            k.append(this.d);
            k.append(", primaryKeyPosition=");
            k.append(this.e);
            k.append(", defaultValue='");
            return m.m(k, this.f, '\'', '}');
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;
        
        public b(final String a, final List list, final List list2, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = Collections.unmodifiableList((List<? extends String>)list);
            this.e = Collections.unmodifiableList((List<? extends String>)list2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a.equals(b.a) && this.b.equals(b.b) && this.c.equals(b.c) && this.d.equals(b.d) && this.e.equals(b.e);
        }
        
        @Override
        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() + ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("ForeignKey{referenceTable='");
            n.w(k, this.a, '\'', ", onDelete='");
            n.w(k, this.b, '\'', ", onUpdate='");
            n.w(k, this.c, '\'', ", columnNames=");
            k.append(this.d);
            k.append(", referenceColumnNames=");
            return m.n(k, (List)this.e, '}');
        }
    }
    
    public static final class c implements Comparable<c>
    {
        public final int f;
        public final int g;
        public final String h;
        public final String i;
        
        public c(final int f, final int g, final String h, final String i) {
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        @Override
        public final int compareTo(final Object o) {
            final c c = (c)o;
            int n;
            if ((n = this.f - c.f) == 0) {
                n = this.g - c.g;
            }
            return n;
        }
    }
    
    public static final class d
    {
        public final String a;
        public final boolean b;
        public final List<String> c;
        public final List<String> d;
        
        public d() {
            throw null;
        }
        
        public d(final String a, final List c, final List list, final boolean b) {
            this.a = a;
            this.b = b;
            this.c = c;
            List<String> nCopies = null;
            Label_0051: {
                if (list != null) {
                    nCopies = list;
                    if (list.size() != 0) {
                        break Label_0051;
                    }
                }
                nCopies = Collections.nCopies(c.size(), ((Enum)Index$Order.ASC).name());
            }
            this.d = nCopies;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            if (this.b != d.b) {
                return false;
            }
            if (!this.c.equals(d.c)) {
                return false;
            }
            if (!this.d.equals(d.d)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return d.a.startsWith("index_");
            }
            return this.a.equals(d.a);
        }
        
        @Override
        public final int hashCode() {
            int hashCode;
            if (this.a.startsWith("index_")) {
                hashCode = -1184239155;
            }
            else {
                hashCode = this.a.hashCode();
            }
            return this.d.hashCode() + (this.c.hashCode() + (hashCode * 31 + (this.b ? 1 : 0)) * 31) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("Index{name='");
            n.w(k, this.a, '\'', ", unique=");
            k.append(this.b);
            k.append(", columns=");
            k.append(this.c);
            k.append(", orders=");
            return m.n(k, (List)this.d, '}');
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Locale;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
import android.database.Cursor;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Collections;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.Map;

public final class 0Fv
{
    public final String LIZ;
    public final Map<String, a> LIZIZ;
    public final Set<b> LIZJ;
    public final Set<d> LIZLLL;
    
    static {
        Covode.recordClassIndex(1683);
    }
    
    public 0Fv(final String liz, final Map<String, a> map, final Set<b> set, final Set<d> set2) {
        this.LIZ = liz;
        this.LIZIZ = Collections.unmodifiableMap((Map<? extends String, ? extends a>)map);
        this.LIZJ = Collections.unmodifiableSet((Set<? extends b>)set);
        Set<d> unmodifiableSet;
        if (set2 == null) {
            unmodifiableSet = null;
        }
        else {
            unmodifiableSet = Collections.unmodifiableSet((Set<? extends d>)set2);
        }
        this.LIZLLL = unmodifiableSet;
    }
    
    public static d LIZ(0Ce liziz, final String s, final boolean b) {
        final StringBuilder sb = new StringBuilder("PRAGMA index_xinfo(`");
        sb.append(s);
        sb.append("`)");
        liziz = (0Ce)liziz.LIZIZ(sb.toString());
        try {
            final int columnIndex = ((Cursor)liziz).getColumnIndex("seqno");
            final int columnIndex2 = ((Cursor)liziz).getColumnIndex("cid");
            final int columnIndex3 = ((Cursor)liziz).getColumnIndex("name");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            final TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
            while (((Cursor)liziz).moveToNext()) {
                if (((Cursor)liziz).getInt(columnIndex2) >= 0) {
                    treeMap.put(((Cursor)liziz).getInt(columnIndex), ((Cursor)liziz).getString(columnIndex3));
                }
            }
            final ArrayList list = new ArrayList(treeMap.size());
            list.addAll((Collection)treeMap.values());
            return new d(s, b, (List<String>)list);
        }
        finally {
            ((Cursor)liziz).close();
        }
    }
    
    public static 0Fv LIZ(final 0Ce 0Ce, final String s) {
        return new 0Fv(s, LIZJ(0Ce, s), LIZIZ(0Ce, s), LIZLLL(0Ce, s));
    }
    
    public static List<c> LIZ(final Cursor cursor) {
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
    
    public static Set<b> LIZIZ(0Ce liziz, final String s) {
        final HashSet set = new HashSet();
        final StringBuilder sb = new StringBuilder("PRAGMA foreign_key_list(`");
        sb.append(s);
        sb.append("`)");
        liziz = (0Ce)liziz.LIZIZ(sb.toString());
        try {
            final int columnIndex = ((Cursor)liziz).getColumnIndex("id");
            final int columnIndex2 = ((Cursor)liziz).getColumnIndex("seq");
            final int columnIndex3 = ((Cursor)liziz).getColumnIndex("table");
            final int columnIndex4 = ((Cursor)liziz).getColumnIndex("on_delete");
            final int columnIndex5 = ((Cursor)liziz).getColumnIndex("on_update");
            final List<c> liz = LIZ((Cursor)liziz);
            for (int count = ((Cursor)liziz).getCount(), i = 0; i < count; ++i) {
                ((Cursor)liziz).moveToPosition(i);
                if (((Cursor)liziz).getInt(columnIndex2) == 0) {
                    final int int1 = ((Cursor)liziz).getInt(columnIndex);
                    final ArrayList list = new ArrayList();
                    final ArrayList<String> list2 = new ArrayList<String>();
                    for (final c c : liz) {
                        if (c.LIZ == int1) {
                            list.add(c.LIZJ);
                            list2.add(c.LIZLLL);
                        }
                    }
                    set.add(new b(((Cursor)liziz).getString(columnIndex3), ((Cursor)liziz).getString(columnIndex4), ((Cursor)liziz).getString(columnIndex5), list, list2));
                }
            }
            return set;
        }
        finally {
            ((Cursor)liziz).close();
        }
    }
    
    public static Map<String, a> LIZJ(0Ce liziz, final String s) {
        final StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(s);
        sb.append("`)");
        liziz = (0Ce)liziz.LIZIZ(sb.toString());
        final HashMap hashMap = new HashMap();
        try {
            if (((Cursor)liziz).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)liziz).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)liziz).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)liziz).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)liziz).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)liziz).getColumnIndex("dflt_value");
                while (((Cursor)liziz).moveToNext()) {
                    final String string = ((Cursor)liziz).getString(columnIndex);
                    hashMap.put(string, new a(string, ((Cursor)liziz).getString(columnIndex2), ((Cursor)liziz).getInt(columnIndex3) != 0, ((Cursor)liziz).getInt(columnIndex4), ((Cursor)liziz).getString(columnIndex5), 2));
                }
            }
            return hashMap;
        }
        finally {
            ((Cursor)liziz).close();
        }
    }
    
    public static Set<d> LIZLLL(final 0Ce 0Ce, String liziz) {
        final StringBuilder sb = new StringBuilder("PRAGMA index_list(`");
        sb.append(liziz);
        sb.append("`)");
        liziz = (String)0Ce.LIZIZ(sb.toString());
        try {
            final int columnIndex = ((Cursor)liziz).getColumnIndex("name");
            final int columnIndex2 = ((Cursor)liziz).getColumnIndex("origin");
            final int columnIndex3 = ((Cursor)liziz).getColumnIndex("unique");
            if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1) {
                return null;
            }
            final HashSet<d> set = new HashSet<d>();
            while (((Cursor)liziz).moveToNext()) {
                if ("c".equals(((Cursor)liziz).getString(columnIndex2))) {
                    final String string = ((Cursor)liziz).getString(columnIndex);
                    final int int1 = ((Cursor)liziz).getInt(columnIndex3);
                    boolean b = true;
                    if (int1 != 1) {
                        b = false;
                    }
                    final d liz = LIZ(0Ce, string, b);
                    if (liz == null) {
                        return null;
                    }
                    set.add(liz);
                }
            }
            return set;
        }
        finally {
            ((Cursor)liziz).close();
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final 0Fv 0Fv = (0Fv)o;
        final String liz = this.LIZ;
        Label_0061: {
            if (liz != null) {
                if (liz.equals(0Fv.LIZ)) {
                    break Label_0061;
                }
            }
            else if (0Fv.LIZ == null) {
                break Label_0061;
            }
            return false;
        }
        final Map<String, a> liziz = this.LIZIZ;
        Label_0095: {
            if (liziz != null) {
                if (liziz.equals(0Fv.LIZIZ)) {
                    break Label_0095;
                }
            }
            else if (0Fv.LIZIZ == null) {
                break Label_0095;
            }
            return false;
        }
        final Set<b> lizj = this.LIZJ;
        Label_0129: {
            if (lizj != null) {
                if (lizj.equals(0Fv.LIZJ)) {
                    break Label_0129;
                }
            }
            else if (0Fv.LIZJ == null) {
                break Label_0129;
            }
            return false;
        }
        final Set<d> lizlll = this.LIZLLL;
        if (lizlll != null) {
            final Set<d> lizlll2 = 0Fv.LIZLLL;
            if (lizlll2 != null) {
                return lizlll.equals(lizlll2);
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final String liz = this.LIZ;
        int hashCode = 0;
        int hashCode2;
        if (liz != null) {
            hashCode2 = liz.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Map<String, a> liziz = this.LIZIZ;
        int hashCode3;
        if (liziz != null) {
            hashCode3 = liziz.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set<b> lizj = this.LIZJ;
        if (lizj != null) {
            hashCode = lizj.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("TableInfo{name='");
        sb.append(this.LIZ);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.LIZIZ);
        sb.append(", foreignKeys=");
        sb.append(this.LIZJ);
        sb.append(", indices=");
        sb.append(this.LIZLLL);
        sb.append('}');
        return sb.toString();
    }
    
    public static final class a
    {
        public final String LIZ;
        public final String LIZIZ;
        public final int LIZJ;
        public final boolean LIZLLL;
        public final int LJ;
        public final String LJFF;
        public final int LJI;
        
        static {
            Covode.recordClassIndex(1684);
        }
        
        public a(final String s, final String s2, final boolean b, final int n) {
            this(s, s2, b, n, null, 0);
        }
        
        public a(String upperCase, final String liziz, final boolean lizlll, int n, final String ljff, final int lji) {
            this.LIZ = upperCase;
            this.LIZIZ = liziz;
            this.LIZLLL = lizlll;
            this.LJ = n;
            n = 5;
            if (liziz != null) {
                upperCase = liziz.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    n = 3;
                }
                else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    n = 2;
                }
                else if (!upperCase.contains("BLOB")) {
                    if (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) {
                        n = 4;
                    }
                    else {
                        n = 1;
                    }
                }
            }
            this.LIZJ = n;
            this.LJFF = ljff;
            this.LJI = lji;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final a a = (a)o;
                if (this.LJ != a.LJ) {
                    return false;
                }
                if (!this.LIZ.equals(a.LIZ)) {
                    return false;
                }
                if (this.LIZLLL != a.LIZLLL) {
                    return false;
                }
                if (this.LJI == 1 && a.LJI == 2) {
                    final String ljff = this.LJFF;
                    if (ljff != null && !ljff.equals(a.LJFF)) {
                        return false;
                    }
                }
                if (this.LJI == 2 && a.LJI == 1) {
                    final String ljff2 = a.LJFF;
                    if (ljff2 != null && !ljff2.equals(this.LJFF)) {
                        return false;
                    }
                }
                final int lji = this.LJI;
                Label_0196: {
                    if (lji != 0 && lji == a.LJI) {
                        final String ljff3 = this.LJFF;
                        if (ljff3 != null) {
                            if (ljff3.equals(a.LJFF)) {
                                break Label_0196;
                            }
                        }
                        else if (a.LJFF == null) {
                            break Label_0196;
                        }
                        return false;
                    }
                }
                if (this.LIZJ == a.LIZJ) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.LIZ.hashCode();
            final int lizj = this.LIZJ;
            int n;
            if (this.LIZLLL) {
                n = 1231;
            }
            else {
                n = 1237;
            }
            return ((hashCode * 31 + lizj) * 31 + n) * 31 + this.LJ;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.LIZ);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.LIZIZ);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.LIZJ);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.LIZLLL);
            sb.append(", primaryKeyPosition=");
            sb.append(this.LJ);
            sb.append(", defaultValue='");
            sb.append(this.LJFF);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String LIZ;
        public final String LIZIZ;
        public final String LIZJ;
        public final List<String> LIZLLL;
        public final List<String> LJ;
        
        static {
            Covode.recordClassIndex(1685);
        }
        
        public b(final String liz, final String liziz, final String lizj, final List<String> list, final List<String> list2) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = Collections.unmodifiableList((List<? extends String>)list);
            this.LJ = Collections.unmodifiableList((List<? extends String>)list2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final b b = (b)o;
            return this.LIZ.equals(b.LIZ) && this.LIZIZ.equals(b.LIZIZ) && this.LIZJ.equals(b.LIZJ) && this.LIZLLL.equals(b.LIZLLL) && this.LJ.equals(b.LJ);
        }
        
        @Override
        public final int hashCode() {
            return (((this.LIZ.hashCode() * 31 + this.LIZIZ.hashCode()) * 31 + this.LIZJ.hashCode()) * 31 + this.LIZLLL.hashCode()) * 31 + this.LJ.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.LIZ);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.LIZIZ);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.LIZJ);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.LIZLLL);
            sb.append(", referenceColumnNames=");
            sb.append(this.LJ);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public static final class c implements Comparable<c>
    {
        public final int LIZ;
        public final int LIZIZ;
        public final String LIZJ;
        public final String LIZLLL;
        
        static {
            Covode.recordClassIndex(1686);
        }
        
        public c(final int liz, final int liziz, final String lizj, final String lizlll) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
    }
    
    public static final class d
    {
        public final String LIZ;
        public final boolean LIZIZ;
        public final List<String> LIZJ;
        
        static {
            Covode.recordClassIndex(1687);
        }
        
        public d(final String liz, final boolean liziz, final List<String> lizj) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final d d = (d)o;
            if (this.LIZIZ != d.LIZIZ) {
                return false;
            }
            if (!this.LIZJ.equals(d.LIZJ)) {
                return false;
            }
            if (this.LIZ.startsWith("index_")) {
                return d.LIZ.startsWith("index_");
            }
            return this.LIZ.equals(d.LIZ);
        }
        
        @Override
        public final int hashCode() {
            int hashCode;
            if (this.LIZ.startsWith("index_")) {
                hashCode = -1184239155;
            }
            else {
                hashCode = this.LIZ.hashCode();
            }
            return (hashCode * 31 + (this.LIZIZ ? 1 : 0)) * 31 + this.LIZJ.hashCode();
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.LIZ);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.LIZIZ);
            sb.append(", columns=");
            sb.append(this.LIZJ);
            sb.append('}');
            return sb.toString();
        }
    }
}

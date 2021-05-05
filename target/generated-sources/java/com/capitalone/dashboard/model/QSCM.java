package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSCM is a Querydsl query type for SCM
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QSCM extends BeanPath<SCM> {

    private static final long serialVersionUID = -239848197L;

    public static final QSCM sCM = new QSCM("sCM");

    public final ListPath<RepoFile, SimplePath<RepoFile>> files = this.<RepoFile, SimplePath<RepoFile>>createList("files", RepoFile.class, SimplePath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> filesAdded = this.<String, StringPath>createList("filesAdded", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> filesModified = this.<String, StringPath>createList("filesModified", String.class, StringPath.class, PathInits.DIRECT2);

    public final ListPath<String, StringPath> filesRemoved = this.<String, StringPath>createList("filesRemoved", String.class, StringPath.class, PathInits.DIRECT2);

    public final NumberPath<Long> numberOfChanges = createNumber("numberOfChanges", Long.class);

    public final StringPath pullNumber = createString("pullNumber");

    public final StringPath scmAuthor = createString("scmAuthor");

    public final StringPath scmAuthorLDAPDN = createString("scmAuthorLDAPDN");

    public final StringPath scmAuthorLogin = createString("scmAuthorLogin");

    public final StringPath scmAuthorType = createString("scmAuthorType");

    public final StringPath scmBranch = createString("scmBranch");

    public final StringPath scmCommitLog = createString("scmCommitLog");

    public final StringPath scmCommitter = createString("scmCommitter");

    public final StringPath scmCommitterLogin = createString("scmCommitterLogin");

    public final NumberPath<Long> scmCommitTimestamp = createNumber("scmCommitTimestamp", Long.class);

    public final ListPath<String, StringPath> scmParentRevisionNumbers = this.<String, StringPath>createList("scmParentRevisionNumbers", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath scmRevisionNumber = createString("scmRevisionNumber");

    public final StringPath scmUrl = createString("scmUrl");

    public final EnumPath<CommitType> type = createEnum("type", CommitType.class);

    public QSCM(String variable) {
        super(SCM.class, forVariable(variable));
    }

    public QSCM(Path<? extends SCM> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSCM(PathMetadata metadata) {
        super(SCM.class, metadata);
    }

}


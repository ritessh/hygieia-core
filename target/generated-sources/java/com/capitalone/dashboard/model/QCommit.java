package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommit is a Querydsl query type for Commit
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommit extends EntityPathBase<Commit> {

    private static final long serialVersionUID = 1091573657L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommit commit = new QCommit("commit");

    public final QSCM _super = new QSCM(this);

    public final org.bson.types.QObjectId collectorItemId;

    //inherited
    public final ListPath<RepoFile, SimplePath<RepoFile>> files = _super.files;

    //inherited
    public final ListPath<String, StringPath> filesAdded = _super.filesAdded;

    //inherited
    public final ListPath<String, StringPath> filesModified = _super.filesModified;

    //inherited
    public final ListPath<String, StringPath> filesRemoved = _super.filesRemoved;

    public final BooleanPath firstEverCommit = createBoolean("firstEverCommit");

    public final org.bson.types.QObjectId id;

    //inherited
    public final NumberPath<Long> numberOfChanges = _super.numberOfChanges;

    //inherited
    public final StringPath pullNumber = _super.pullNumber;

    //inherited
    public final StringPath scmAuthor = _super.scmAuthor;

    //inherited
    public final StringPath scmAuthorLDAPDN = _super.scmAuthorLDAPDN;

    //inherited
    public final StringPath scmAuthorLogin = _super.scmAuthorLogin;

    //inherited
    public final StringPath scmAuthorType = _super.scmAuthorType;

    //inherited
    public final StringPath scmBranch = _super.scmBranch;

    //inherited
    public final StringPath scmCommitLog = _super.scmCommitLog;

    //inherited
    public final StringPath scmCommitter = _super.scmCommitter;

    //inherited
    public final StringPath scmCommitterLogin = _super.scmCommitterLogin;

    //inherited
    public final NumberPath<Long> scmCommitTimestamp = _super.scmCommitTimestamp;

    //inherited
    public final ListPath<String, StringPath> scmParentRevisionNumbers = _super.scmParentRevisionNumbers;

    //inherited
    public final StringPath scmRevisionNumber = _super.scmRevisionNumber;

    //inherited
    public final StringPath scmUrl = _super.scmUrl;

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final EnumPath<CommitType> type = _super.type;

    public QCommit(String variable) {
        this(Commit.class, forVariable(variable), INITS);
    }

    public QCommit(Path<? extends Commit> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommit(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommit(PathMetadata metadata, PathInits inits) {
        this(Commit.class, metadata, inits);
    }

    public QCommit(Class<? extends Commit> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = inits.isInitialized("id") ? new org.bson.types.QObjectId(forProperty("id")) : null;
    }

}


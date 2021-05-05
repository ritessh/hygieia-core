package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBinaryArtifact is a Querydsl query type for BinaryArtifact
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBinaryArtifact extends EntityPathBase<BinaryArtifact> {

    private static final long serialVersionUID = -1098886827L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBinaryArtifact binaryArtifact = new QBinaryArtifact("binaryArtifact");

    public final QBaseModel _super;

    public final StringPath actual_md5 = createString("actual_md5");

    public final StringPath actual_sha1 = createString("actual_sha1");

    public final StringPath artifactClassifier = createString("artifactClassifier");

    public final StringPath artifactExtension = createString("artifactExtension");

    public final StringPath artifactGroupId = createString("artifactGroupId");

    public final StringPath artifactModule = createString("artifactModule");

    public final StringPath artifactName = createString("artifactName");

    public final StringPath artifactVersion = createString("artifactVersion");

    public final StringPath authorLDAPDN = createString("authorLDAPDN");

    public final ListPath<Build, QBuild> buildInfos = this.<Build, QBuild>createList("buildInfos", Build.class, QBuild.class, PathInits.DIRECT2);

    public final StringPath buildNumber = createString("buildNumber");

    public final StringPath buildUrl = createString("buildUrl");

    public final StringPath canonicalName = createString("canonicalName");

    //inherited
    public final StringPath clientReference;

    public final org.bson.types.QObjectId collectorItemId;

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Long> createdTimeStamp = createNumber("createdTimeStamp", Long.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath instanceUrl = createString("instanceUrl");

    public final StringPath jobName = createString("jobName");

    public final StringPath jobUrl = createString("jobUrl");

    public final MapPath<String, String, StringPath> metadata = this.<String, String, StringPath>createMap("metadata", String.class, String.class, StringPath.class);

    public final StringPath modifiedBy = createString("modifiedBy");

    public final NumberPath<Long> modifiedTimeStamp = createNumber("modifiedTimeStamp", Long.class);

    public final StringPath path = createString("path");

    public final StringPath repo = createString("repo");

    public final StringPath scmBranch = createString("scmBranch");

    public final StringPath scmRevisionNumber = createString("scmRevisionNumber");

    public final StringPath scmUrl = createString("scmUrl");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final ListPath<String, StringPath> virtualRepos = this.<String, StringPath>createList("virtualRepos", String.class, StringPath.class, PathInits.DIRECT2);

    public QBinaryArtifact(String variable) {
        this(BinaryArtifact.class, forVariable(variable), INITS);
    }

    public QBinaryArtifact(Path<? extends BinaryArtifact> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBinaryArtifact(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBinaryArtifact(PathMetadata metadata, PathInits inits) {
        this(BinaryArtifact.class, metadata, inits);
    }

    public QBinaryArtifact(Class<? extends BinaryArtifact> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}


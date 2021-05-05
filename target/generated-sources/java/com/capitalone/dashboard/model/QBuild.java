package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBuild is a Querydsl query type for Build
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBuild extends EntityPathBase<Build> {

    private static final long serialVersionUID = 1419936716L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBuild build = new QBuild("build");

    public final QBaseModel _super;

    public final EnumPath<BuildStatus> buildStatus = createEnum("buildStatus", BuildStatus.class);

    public final StringPath buildUrl = createString("buildUrl");

    //inherited
    public final StringPath clientReference;

    public final ListPath<RepoBranch, QRepoBranch> codeRepos = this.<RepoBranch, QRepoBranch>createList("codeRepos", RepoBranch.class, QRepoBranch.class, PathInits.DIRECT2);

    public final org.bson.types.QObjectId collectorItemId;

    public final MapPath<String, String, StringPath> deployMetadata = this.<String, String, StringPath>createMap("deployMetadata", String.class, String.class, StringPath.class);

    public final NumberPath<Long> duration = createNumber("duration", Long.class);

    public final NumberPath<Long> endTime = createNumber("endTime", Long.class);

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath log = createString("log");

    public final StringPath number = createString("number");

    public final ListPath<SCM, QSCM> sourceChangeSet = this.<SCM, QSCM>createList("sourceChangeSet", SCM.class, QSCM.class, PathInits.DIRECT2);

    public final ListPath<BuildStage, QBuildStage> stages = this.<BuildStage, QBuildStage>createList("stages", BuildStage.class, QBuildStage.class, PathInits.DIRECT2);

    public final StringPath startedBy = createString("startedBy");

    public final NumberPath<Long> startTime = createNumber("startTime", Long.class);

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QBuild(String variable) {
        this(Build.class, forVariable(variable), INITS);
    }

    public QBuild(Path<? extends Build> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBuild(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBuild(PathMetadata metadata, PathInits inits) {
        this(Build.class, metadata, inits);
    }

    public QBuild(Class<? extends Build> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collectorItemId = inits.isInitialized("collectorItemId") ? new org.bson.types.QObjectId(forProperty("collectorItemId")) : null;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}


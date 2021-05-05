package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBuildStage is a Querydsl query type for BuildStage
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QBuildStage extends BeanPath<BuildStage> {

    private static final long serialVersionUID = 744214162L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBuildStage buildStage = new QBuildStage("buildStage");

    public final QBaseModel _super;

    public final MapPath<String, Object, SimplePath<Object>> _links = this.<String, Object, SimplePath<Object>>createMap("_links", String.class, Object.class, SimplePath.class);

    //inherited
    public final StringPath clientReference;

    public final StringPath durationMillis = createString("durationMillis");

    public final StringPath endTime = createString("endTime");

    public final SimplePath<Error> error = createSimple("error", Error.class);

    public final StringPath exec_node_logUrl = createString("exec_node_logUrl");

    // inherited
    public final org.bson.types.QObjectId id;

    public final StringPath log = createString("log");

    public final StringPath name = createString("name");

    public final StringPath parentId = createString("parentId");

    public final StringPath stageId = createString("stageId");

    public final StringPath startTimeMillis = createString("startTimeMillis");

    public final StringPath status = createString("status");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public QBuildStage(String variable) {
        this(BuildStage.class, forVariable(variable), INITS);
    }

    public QBuildStage(Path<? extends BuildStage> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBuildStage(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBuildStage(PathMetadata metadata, PathInits inits) {
        this(BuildStage.class, metadata, inits);
    }

    public QBuildStage(Class<? extends BuildStage> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QBaseModel(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.id = _super.id;
        this.upsertTime = _super.upsertTime;
    }

}


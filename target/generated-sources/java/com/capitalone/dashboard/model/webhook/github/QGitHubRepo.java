package com.capitalone.dashboard.model.webhook.github;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QGitHubRepo is a Querydsl query type for GitHubRepo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGitHubRepo extends EntityPathBase<GitHubRepo> {

    private static final long serialVersionUID = 903940007L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QGitHubRepo gitHubRepo = new QGitHubRepo("gitHubRepo");

    public final com.capitalone.dashboard.model.QCollectorItem _super;

    public final StringPath branch = createString("branch");

    //inherited
    public final StringPath clientReference;

    // inherited
    public final com.capitalone.dashboard.model.QCollector collector;

    // inherited
    public final org.bson.types.QObjectId collectorId;

    //inherited
    public final StringPath description;

    //inherited
    public final BooleanPath enabled;

    //inherited
    public final StringPath environment;

    //inherited
    public final NumberPath<Integer> errorCount;

    //inherited
    public final ListPath<com.capitalone.dashboard.model.CollectionError, com.capitalone.dashboard.model.QCollectionError> errors;

    // inherited
    public final org.bson.types.QObjectId id;

    //inherited
    public final NumberPath<Long> lastUpdated;

    //inherited
    public final StringPath niceName;

    //inherited
    public final MapPath<String, Object, SimplePath<Object>> options;

    public final StringPath password = createString("password");

    public final StringPath personalAccessToken = createString("personalAccessToken");

    //inherited
    public final BooleanPath pushed;

    //inherited
    public final StringPath refreshLink;

    public final StringPath repoUrl = createString("repoUrl");

    public final StringPath type = createString("type");

    //inherited
    public final DateTimePath<java.util.Date> upsertTime;

    public final StringPath userId = createString("userId");

    public QGitHubRepo(String variable) {
        this(GitHubRepo.class, forVariable(variable), INITS);
    }

    public QGitHubRepo(Path<? extends GitHubRepo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QGitHubRepo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QGitHubRepo(PathMetadata metadata, PathInits inits) {
        this(GitHubRepo.class, metadata, inits);
    }

    public QGitHubRepo(Class<? extends GitHubRepo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new com.capitalone.dashboard.model.QCollectorItem(type, metadata, inits);
        this.clientReference = _super.clientReference;
        this.collector = _super.collector;
        this.collectorId = _super.collectorId;
        this.description = _super.description;
        this.enabled = _super.enabled;
        this.environment = _super.environment;
        this.errorCount = _super.errorCount;
        this.errors = _super.errors;
        this.id = _super.id;
        this.lastUpdated = _super.lastUpdated;
        this.niceName = _super.niceName;
        this.options = _super.options;
        this.pushed = _super.pushed;
        this.refreshLink = _super.refreshLink;
        this.upsertTime = _super.upsertTime;
    }

}


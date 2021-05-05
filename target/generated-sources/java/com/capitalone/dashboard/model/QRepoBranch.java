package com.capitalone.dashboard.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRepoBranch is a Querydsl query type for RepoBranch
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QRepoBranch extends BeanPath<RepoBranch> {

    private static final long serialVersionUID = 1781431574L;

    public static final QRepoBranch repoBranch = new QRepoBranch("repoBranch");

    public final StringPath branch = createString("branch");

    public final StringPath repoName = createString("repoName");

    public final EnumPath<RepoBranch.RepoType> type = createEnum("type", RepoBranch.RepoType.class);

    public final StringPath url = createString("url");

    public QRepoBranch(String variable) {
        super(RepoBranch.class, forVariable(variable));
    }

    public QRepoBranch(Path<? extends RepoBranch> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRepoBranch(PathMetadata metadata) {
        super(RepoBranch.class, metadata);
    }

}


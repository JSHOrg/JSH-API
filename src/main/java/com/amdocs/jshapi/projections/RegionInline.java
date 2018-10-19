package com.amdocs.jshapi.projections;

import org.springframework.data.rest.core.config.Projection;

/*import com.amdocs.jshapi.domain.BancoAlimentos; */
import com.amdocs.jshapi.domain.Region;

@Projection(name = "regionInline", types = Region.class)

public interface RegionInline {
}

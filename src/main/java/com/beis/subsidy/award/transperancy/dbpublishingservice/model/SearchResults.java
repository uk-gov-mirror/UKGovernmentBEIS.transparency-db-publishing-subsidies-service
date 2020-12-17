package com.beis.subsidy.award.transperancy.dbpublishingservice.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * Search results object - Represents search results for award search
 *
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchResults {

	public int totalSearchResults;
	public List<Award> awards;
	
}

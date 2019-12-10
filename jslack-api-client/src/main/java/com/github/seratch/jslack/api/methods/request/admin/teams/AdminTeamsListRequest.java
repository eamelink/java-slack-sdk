package com.github.seratch.jslack.api.methods.request.admin.teams;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

/**
 * https://api.slack.com/methods/admin.teams.list
 */
@Data
@Builder
public class AdminTeamsListRequest implements SlackApiRequest {

    /**
     * Authentication token bearing required scopes.
     */
    private String token;

    /**
     * Set cursor to next_cursor returned by the previous call to list items in the next page.
     */
    private String cursor;

    /**
     * The maximum number of items to return. Must be between 1 - 100 both inclusive.
     */
    private Integer limit;

}

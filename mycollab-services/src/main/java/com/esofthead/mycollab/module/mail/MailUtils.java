/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.mail;

import com.esofthead.mycollab.configuration.SiteConfiguration;
import com.esofthead.mycollab.configuration.Storage;
import com.esofthead.mycollab.core.DeploymentMode;
import com.esofthead.mycollab.module.user.domain.BillingAccount;
import com.esofthead.mycollab.module.user.service.BillingAccountService;
import com.esofthead.mycollab.spring.ApplicationContextUtil;

/**
 * @author MyCollab Ltd.
 * @since 4.0
 */
public class MailUtils {
    public static String getSiteUrl(Integer sAccountId) {
        String siteUrl = "";
        if (SiteConfiguration.getDeploymentMode() == DeploymentMode.site) {
            BillingAccountService billingAccountService = ApplicationContextUtil
                    .getSpringBean(BillingAccountService.class);
            BillingAccount account = billingAccountService.getAccountById(sAccountId);
            if (account != null) {
                siteUrl = SiteConfiguration.getSiteUrl(account.getSubdomain());
            }
        } else {
            siteUrl = SiteConfiguration.getSiteUrl("");
        }
        return siteUrl;
    }

    public static String getAvatarLink(String userAvatarId, int size) {
        return Storage.getAvatarPath(userAvatarId, size);
    }
}

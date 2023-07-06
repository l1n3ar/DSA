class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:

        set_ = set()

        for email in emails:
            local_name,domain_name = email.split("@")
            local_name = self.clean_local_name(local_name)
            set_.add(local_name + '@' + domain_name)
        
        return len(set_)
    
    def clean_local_name(self,local_name) -> str:
        local_name = local_name.split('+')[0]
        local_name = local_name.replace(".","")
        return local_name
        
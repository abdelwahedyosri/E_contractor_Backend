package group_6.e_contractor_backend.job_offer_module.controllers;

import group_6.e_contractor_backend.job_offer_module.services.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("job-application")
@RequiredArgsConstructor
public class JobApplicationApiController {
    private final JobApplicationService jobApplicationService;
}
